package com.example.studyspring5.Pattern.factory.JDBCAbstractFactory;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/11 8:13
 */

import java.io.IOException;
import java.sql.*;
import java.io.InputStream;
import java.util.Properties;

/**
 * 自定义连接处getInstance()方法，返回Pool的唯一实例，第一次调用时将执行构造函数
 * 构造函数Pool()调用驱动装载loadDriver()函数；createPool()函数创建连接池 ,loadDrivers()装载驱动
 * getConnection()返回一个链接实例，getConnection(Long time)添加时间限制
 * freeConnection(Connection con)将con连接实例返回连接池，getNum()返回空闲连接数
 * getNumActive()返回当前使用连接数
 * */
public abstract class Pool {
    public String propertiesName = "connection-INF.properties";
    private static Pool instance = null;//定义唯一实例
    protected int maxConnect = 100;//定义最大连接数
    protected int normalConnect = 10;//保持连接数
    protected String driverName = null;//驱动字符串
    protected Driver driver = null;//驱动变量

    //私有构造函数，不允许外界访问
    protected Pool(){
        try {
            init();
            loadDrivers(driverName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //初始化所有从配置文件读取的成员变量
    private void init() throws IOException{
        InputStream is = Pool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();
        p.load(is);
        this.driverName = p.getProperty("driverName");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

    //装载和注册所有JDBC驱动程序
    protected void loadDrivers(String dri){
        String driverClassName = dri;
        try{
            driver = (Driver) Class.forName(driverClassName).newInstance();
            DriverManager.registerDriver(driver);
            System.out.println("成功注册JDBC驱动程序" + driverClassName);
        }catch (Exception e){
            System.out.println("无法注册JDBC驱动程序" + driverClassName + "错误：" + e);
        }
    }

    //创建连接池
    public abstract void createPool();
    /**
     * (单例模式)返回数据库连接池Pool的实例
     *
     * @param driverName 数据库驱动字符串
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static synchronized Pool getInstance() throws IOException,
            ClassNotFoundException,IllegalAccessException,InstantiationException{
        if(instance != null){
            instance = (Pool) Class.forName("org.jdbc.sqlhelper.Pool").newInstance();
        }
        return instance;
    }

    //获得一个可用的链接，如果没有则创建一个连接，且小于最大连接数限制
    public abstract Connection getConnection();

    //获得一个连接，有时间限制
    public abstract Connection getConnection(Long time);

    //将连接对象带回连接池
    public abstract void freeConnection(Connection con);

    //返回当前空闲连接数
    public abstract int getNum();

    //返回当前工作连接数
    public abstract int getNumActive();


    public synchronized void release(){
        //撤销驱动
        try {
            DriverManager.deregisterDriver(driver);
            System.out.println("撤销Jdbc驱动程序" + driver.getClass().getName());
        }catch (Exception e){
            System.out.println("无法撤销Jdbc驱动程序的注册" + driver.getClass().getName());
        }
    }
}
