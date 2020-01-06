package top.tohsaka.onestep.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import top.tohsaka.onestep.entity.Admin;
import top.tohsaka.onestep.enums.RedisKey;
import top.tohsaka.onestep.enums.Result;
import top.tohsaka.onestep.model.ResultModel;
import top.tohsaka.onestep.utils.LoginUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.Serializable;

@Component
public class AdminInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(AdminInterceptor.class);
    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String sessionid = request.getSession().getId();
        String key = RedisKey.ADMIN_LOGIN.append(sessionid);
        Admin admin = (Admin) redisTemplate.opsForValue().get(key);
        if(admin != null){
            LoginUtils.setAdmin(admin);
            return true;
        }
        this.write(response,ResultModel.failed(Result.NOT_LOGIN));
        return false;
    }

    private void write(HttpServletResponse response, ResultModel resultModel){
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            writer.write(resultModel.toJSON().toString());
        }catch(Exception e){
            log.error("response write error: {}",e.getLocalizedMessage());
        }finally{
            if(writer != null){
                try{
                    writer.close();
                }catch(Exception e){}
            }
        }
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LoginUtils.clear();
    }
}
