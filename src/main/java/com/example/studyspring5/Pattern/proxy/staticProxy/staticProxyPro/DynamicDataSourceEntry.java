package com.example.studyspring5.Pattern.proxy.staticProxy.staticProxyPro;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 12:36
 */
//动态切换数据源
public class DynamicDataSourceEntry {
    //默认数据源
    private final static String DEFAULT_SOURCE = null;
    private final static ThreadLocal<String> local = new ThreadLocal<String>();
    private DynamicDataSourceEntry(){}

    //清空数据源
    public static void clear(){
        local.remove();
    }
    //获取当前正在使用的数据源名字
    public static String get(){
        return local.get();
    }
    //还原当前切换的数据源
    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }
    //设置已知名字的数据源
    public static void set(String source){
        local.set(source);
    }
    //跟据年份动态设置数据源
    public static void set(int year){
        local.set("DB_" + year);
    }
}
