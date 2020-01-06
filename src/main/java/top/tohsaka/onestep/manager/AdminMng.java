package top.tohsaka.onestep.manager;

import top.tohsaka.onestep.entity.Admin;
import top.tohsaka.onestep.manager.base.BaseMng;
import top.tohsaka.onestep.model.ResultModel;

public interface AdminMng extends BaseMng<Admin> {

    Admin findByAccount(String account);

    ResultModel<Admin> login(String account,String password,String sessionid);
}
