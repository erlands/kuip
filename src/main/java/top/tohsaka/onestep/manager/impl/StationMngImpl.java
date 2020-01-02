package top.tohsaka.onestep.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.tohsaka.onestep.entity.Station;
import top.tohsaka.onestep.manager.StationMng;
import top.tohsaka.onestep.mapper.StationMapper;

@Service
@Transactional
public class StationMngImpl implements StationMng {
    @Autowired
    private StationMapper mapper;

    @Override
    public Station save(Station bean) {
        mapper.insert(bean);
        return bean;
    }

    @Override
    @Transactional(readOnly = true)
    public Station get(Number id) {
        return mapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public int update(Station bean) {
        return mapper.updateByPrimaryKey(bean);
    }

    @Override
    public int delete(Number id) {
        return mapper.deleteByPrimaryKey(id.intValue());
    }
}
