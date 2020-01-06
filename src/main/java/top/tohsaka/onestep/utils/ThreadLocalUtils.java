package top.tohsaka.onestep.utils;

import java.util.HashMap;

public class ThreadLocalUtils {

    private static final ThreadLocal<HashMap<String,Object>> local = new ThreadLocal<>();

    public static Object get(String key){
        HashMap<String, Object> map = local.get();
        if(map != null){
            return map.get(key);
        }
        return null;
    }

    public static void set(String key,Object value){
        HashMap<String, Object> map = local.get();
        if(map != null){
            map = new HashMap<>();
            local.set(map);
        }
        map.put(key,value);
    }

    public static void clear(){
        HashMap<String, Object> map = local.get();
        if(map != null){
            map.clear();
        }
    }
}
