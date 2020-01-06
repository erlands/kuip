package top.tohsaka.onestep.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台车站管理相关
 */
@RestController
@RequestMapping("/admin")
public class AdminStationAct {

    @GetMapping("/hello")
    public String hello(){
        return "111";
    }
}
