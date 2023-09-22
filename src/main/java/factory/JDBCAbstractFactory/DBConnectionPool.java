package factory.JDBCAbstractFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/11 12:48
 */
public final class DBConnectionPool extends Pool{
    private int checkedOUT;//正在使用的连接数
    private Vector<Connection> freeConnections = new Vector<Connection>();//存放产生的连接对象容器
    private String passWord = null;//密码
    private String url = null;//连接路径
    private String userName = null;//用户
    private static int num = 0;//空闲连接数
    private static int numActive = 0;//当前可用连接数
    private static DBConnectionPool pool = null;//连接池实例变量

    //产生数据连接池
    public static synchronized DBConnectionPool getInstance(){
        if (pool == null){
            pool = new DBConnectionPool();
        }
        return pool;
    }

    //获得一个数据连接池实例
    private DBConnectionPool(){
        try{
            init();
            for(int i = 0;i < normalConnect;i++){
                Connection c = newConnection();
                if(c != null){
                    freeConnections.addElement(c);
                    num++;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void init() throws IOException{
        InputStream is = DBConnectionPool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();
        p.load(is);
        this.userName = p.getProperty("userName");
        this.url = p.getProperty("url");
        this.passWord = p.getProperty("passWord");
        this.driverName = p.getProperty("driverName");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }


    //创建一个新连接
    private Connection newConnection(){
        Connection con = null;
        try{
            if(userName == null){
                con = DriverManager.getConnection(url);
            }else {
                con = DriverManager.getConnection(url,userName,passWord);
            }
            System.out.println("创建一个连接池");
        }catch (Exception e){
            System.out.println("无法创建这个URL的连接" + url);
            return null;
        }
        return con;
    }

    //建立连接池
    @Override
    public void createPool() {
        pool = new DBConnectionPool();
        if(pool != null){
            System.out.println("创建连接池成功");
        }else {
            System.out.println("创建连接池失败");
        }
    }

    //单例模式 获取一个可用连接
    @Override
    public synchronized Connection getConnection() {
        Connection con = null;
        if (freeConnections.size() > 0){//还有空闲连接
            num--;
            con = (Connection) freeConnections.firstElement();
            freeConnections.removeElementAt(0);
            try {
                if (con.isClosed()){
                    System.out.println("从中删除一个无效连接");
                    con = getConnection();
                }
            }catch (Exception e){
                System.out.println("从连接池中删除一个无效连接");
                con = getConnection();
            }
        }else if (maxConnect == 0 || checkedOUT < maxConnect){//没有空闲连接且当前连接小于最大允许值，最大值为0则不限制
            con = newConnection();
        }
        if (con != null){//当前连接时加1
            checkedOUT++;
        }
        numActive++;
        return con;
    }

    @Override
    public synchronized Connection getConnection(Long time) {
        Long startTime = new Date().getTime();
        Connection con;
        while ((con = getConnection()) == null){
            try{
                wait(time);//线程等待
            }catch (InterruptedException e){
            }
            if ((new Date().getTime() - startTime) >= time){

                return null;//如果超时则返回
            }
        }
        return con;
    }

    //关闭所有连接
    @Override
    public synchronized void freeConnection(Connection con) {
        freeConnections.addElement(con);
        num++;
        checkedOUT--;
        numActive--;
        notifyAll();//解锁
    }

    //返回当前空闲连接数
    @Override
    public int getNum() {
        return num;
    }

    //返回当前连接数
    @Override
    public int getNumActive() {
        return numActive;
    }

    //关闭所有连接
    public synchronized void release(){
        try{
            //将当前连接赋值到枚举中
            Enumeration allConnections = freeConnections.elements();
            //循环使用关闭所有连接
            while (allConnections.hasMoreElements()){
                //如果此枚举对象至少还有一个可提供的元素，则返回此枚举对象的下一个元素
                Connection con = (Connection) allConnections.nextElement();
                try{
                    con.close();
                    num--;
                }catch (SQLException e){
                    System.out.println("无法关闭连接池中的连接");
                }
            }
            freeConnections.removeElementAt(1);
            numActive = 0;
        }finally {
            super.release();
        }
    }

}
