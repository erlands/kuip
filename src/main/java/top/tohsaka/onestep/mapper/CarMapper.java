package top.tohsaka.onestep.mapper;


import org.apache.ibatis.annotations.Mapper;
import top.tohsaka.onestep.entity.Car;
import top.tohsaka.onestep.entity.CarExample;
import top.tohsaka.onestep.mapper.base.BaseDao;

@Mapper
public interface CarMapper extends BaseDao<Car,CarExample> {

}