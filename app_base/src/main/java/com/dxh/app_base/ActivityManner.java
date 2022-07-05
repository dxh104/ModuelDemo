package com.dxh.app_base;


import java.util.HashMap;

/**
 * Created by XHD on 2022/07/05
 */
public class ActivityManner {
    public static HashMap<String, Class> activityMap = new HashMap();

    public static void put(String key, Class activity) {
        activityMap.put(key, activity);
    }

    public static Class get(String key) {
        return activityMap.get(key);
    }

}
