package com.example.studyspring5.Template.JdbcTemplate;

import java.util.List;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/24 19:07
 */
//memberDao测试类
public class MemberDaoTest {

    public static void main(String[] args){
        MemberDao memberDao = new MemberDao(null);

        List<?> result = memberDao.selectAll();
        System.out.println(result);

    }

}
