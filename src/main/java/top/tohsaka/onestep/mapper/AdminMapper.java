package top.tohsaka.onestep.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.tohsaka.onestep.entity.Admin;
import top.tohsaka.onestep.entity.AdminExample;
import top.tohsaka.onestep.mapper.base.BaseDao;

@Mapper
public interface AdminMapper extends BaseDao<Admin,AdminExample> {

    Admin findByAccount(String account);
}