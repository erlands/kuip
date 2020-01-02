package top.tohsaka.onestep.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.tohsaka.onestep.entity.Line;
import top.tohsaka.onestep.entity.LineExample;

@Mapper
public interface LineMapper {
    long countByExample(LineExample example);

    int deleteByExample(LineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Line record);

    int insertSelective(Line record);

    List<Line> selectByExample(LineExample example);

    Line selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Line record, @Param("example") LineExample example);

    int updateByExample(@Param("record") Line record, @Param("example") LineExample example);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
}