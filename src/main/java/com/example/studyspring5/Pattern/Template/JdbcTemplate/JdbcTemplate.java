package com.example.studyspring5.Pattern.Template.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/24 18:26
 */
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper,Object[] values){
        try {
            //获取连接
            Connection conn = this.getConnection();
            //创建语句集
            PreparedStatement pstm = this.createPrePareStatement(conn,sql);
            //执行语句集
            ResultSet rs = this.executeQuery(pstm,values);
            //关闭结果集
            this.closeResultSet(rs);
            //关闭语句集
            this.closeStatement(pstm);
            //关闭连接
            this.closeConnection(conn);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    protected void closeConnection(Connection conn) throws SQLException {
        //不关闭数据库连接池
        conn.close();
    }

    protected void closeStatement(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }

    protected void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    protected List<?> ParesResultSet(ResultSet rs,RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    protected ResultSet executeQuery(PreparedStatement pstm , Object[] values) throws SQLException {
        for(int i = 0 ; i< values.length;i++){
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    protected PreparedStatement createPrePareStatement(Connection conn,String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    protected Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }

}
