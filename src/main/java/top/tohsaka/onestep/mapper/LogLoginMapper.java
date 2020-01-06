package top.tohsaka.onestep.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.tohsaka.onestep.entity.LogLogin;
import top.tohsaka.onestep.entity.LogLoginExample;
import top.tohsaka.onestep.mapper.base.BaseDao;

@Mapper
public interface LogLoginMapper extends BaseDao<LogLogin,LogLoginExample> {

}