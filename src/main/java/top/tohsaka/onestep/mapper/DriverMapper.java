package top.tohsaka.onestep.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.tohsaka.onestep.entity.Driver;
import top.tohsaka.onestep.entity.DriverExample;
import top.tohsaka.onestep.mapper.base.BaseDao;

@Mapper
public interface DriverMapper extends BaseDao<Driver,DriverExample> {

}