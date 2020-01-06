package top.tohsaka.onestep.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.tohsaka.onestep.entity.LogLogin;
import top.tohsaka.onestep.manager.LogLoginMng;
import top.tohsaka.onestep.mapper.LogLoginMapper;

@Service
@Transactional(readOnly = true)
public class LogLoginMngImpl implements LogLoginMng {
    @Autowired
    private LogLoginMapper mapper;

    @Override
    public LogLogin save(LogLogin bean) {
        mapper.insert(bean);
        return bean;
    }

    @Override
    @Transactional(readOnly = true)
    public LogLogin get(Number id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(LogLogin bean) {
        return mapper.updateByPrimaryKey(bean);
    }

    @Override
    public int delete(Number id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
