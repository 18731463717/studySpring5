package com.example.studyspring5.Template.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/24 18:55
 */
//Member的数据库操作类
public class MemberDao extends JdbcTemplate{
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from t_member";

        return super.executeQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet rs , int rowNum) throws Exception {
                Member member = new Member();
                //字段如果过多可以用原型模式
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }
}
