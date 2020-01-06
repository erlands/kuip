package top.tohsaka.onestep.mapper;


import org.apache.ibatis.annotations.Mapper;
import top.tohsaka.onestep.entity.Station;
import top.tohsaka.onestep.entity.StationExample;
import top.tohsaka.onestep.mapper.base.BaseDao;

@Mapper
public interface StationMapper extends BaseDao<Station,StationExample> {

}