package top.tohsaka.onestep.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.tohsaka.onestep.entity.Admin;
import top.tohsaka.onestep.manager.AdminMng;
import top.tohsaka.onestep.model.ResultModel;

import javax.servlet.http.HttpServletRequest;


/**
 * 后台管理员登陆相关
 */
@RestController
@RequestMapping("/admin")
public class AdminLoginAct {
    @Autowired
    private AdminMng manager;

    @PostMapping("/login")
    public ResultModel<Admin> login(@RequestParam String account,
                                    @RequestParam String password,
                                    HttpServletRequest request){
        return manager.login(account, password,request.getSession().getId());
    }
}
