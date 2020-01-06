package top.tohsaka.onestep.enums;

import java.io.Serializable;

public enum RedisKey {
    ADMIN_LOGIN("admin:login:key_"),
    ADMIN_LOGIN_REVERSE("admin:login:reverse:key_"),
    DRIVER_LOGIN("driver:login:key_"),
    DRIVER_LOGIN_REVERSE("driver:login:reverse:key_"),
    USER_LOGIN("user:login:key_"),
    USER_LOGIN_REVERSE("user:login:reverse:key_");

    private String key; //登陆key

    RedisKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String append(Serializable obj){
        return this.key + obj;
    }
}
