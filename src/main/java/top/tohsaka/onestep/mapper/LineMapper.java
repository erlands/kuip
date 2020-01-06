package top.tohsaka.onestep.mapper;


import org.apache.ibatis.annotations.Mapper;
import top.tohsaka.onestep.entity.Line;
import top.tohsaka.onestep.entity.LineExample;
import top.tohsaka.onestep.mapper.base.BaseDao;

@Mapper
public interface LineMapper extends BaseDao<Line,LineExample> {

}