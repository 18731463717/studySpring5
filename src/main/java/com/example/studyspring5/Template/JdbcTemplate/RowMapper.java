package com.example.studyspring5.Template.JdbcTemplate;

import java.sql.ResultSet;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/24 18:25
 */
//约束ORM逻辑接口
public interface RowMapper<T>{
    T mapRow(ResultSet rs,int rowNum) throws Exception;
}
