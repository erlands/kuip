package top.tohsaka.onestep.utils;

import top.tohsaka.onestep.entity.Admin;

public class LoginUtils {

    public static Admin getAdmin(){
        return (Admin) ThreadLocalUtils.get("admin");
    }

    public static void setAdmin(Admin admin){
        ThreadLocalUtils.set("admin",admin);
    }

    public static void clear(){
        ThreadLocalUtils.clear();
    }
}
