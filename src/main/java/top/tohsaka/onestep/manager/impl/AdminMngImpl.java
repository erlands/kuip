package top.tohsaka.onestep.manager.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.tohsaka.onestep.entity.Admin;
import top.tohsaka.onestep.entity.LogLogin;
import top.tohsaka.onestep.enums.LoginResult;
import top.tohsaka.onestep.enums.LoginType;
import top.tohsaka.onestep.enums.RedisKey;
import top.tohsaka.onestep.manager.AdminMng;
import top.tohsaka.onestep.manager.LogLoginMng;
import top.tohsaka.onestep.mapper.AdminMapper;
import top.tohsaka.onestep.model.ResultModel;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Service
@Transactional
public class AdminMngImpl implements AdminMng {

    private static final Logger log = LoggerFactory.getLogger(AdminMngImpl.class);
    @Autowired
    private AdminMapper mapper;
    @Autowired
    private LogLoginMng logMng;
    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;
    @Value("${login.timeout.admin}")
    private long timeout;

    @Override
    public Admin save(Admin bean) {
        mapper.insert(bean);
        return bean;
    }

    @Override
    @Transactional(readOnly = true)
    public Admin get(Number id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Admin bean) {
        return mapper.updateByPrimaryKey(bean);
    }

    @Override
    public int delete(Number id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Admin findByAccount(String account) {
        return mapper.findByAccount(account);
    }

    @Override
    public ResultModel<Admin> login(String account, String password,String sessionid) {
        LogLogin logLogin = new LogLogin(LoginType.ADMIN,account,password,sessionid);
        Admin admin = this.findByAccount(account);
        try{
            if(admin == null){
                logLogin.result(LoginResult.ACCOUNT_NOT_FOUND);
                return ResultModel.failed("账号不存在");
            }
            if(!admin.getPassword().equals(password)){
                logLogin.result(LoginResult.PASSWORD_WRONG);
                return ResultModel.failed("密码错误");
            }
            if(admin.getDisabled()){
                logLogin.result(LoginResult.ACCOUNT_DISABLED);
                return ResultModel.failed("账号被禁用");
            }
            logLogin.success(admin.getId());
            String key = RedisKey.ADMIN_LOGIN.append(sessionid);
            redisTemplate.opsForValue().set(key,admin,timeout, TimeUnit.SECONDS);
            key = RedisKey.ADMIN_LOGIN_REVERSE.append(admin.getId());
            redisTemplate.opsForValue().set(key,sessionid,timeout,TimeUnit.SECONDS);
        }catch(Exception e){
            log.error("login error:", e.getLocalizedMessage());
        }finally{
            logMng.save(logLogin);
        }
        admin.setHide(true);
        return ResultModel.success(admin);
    }
}
