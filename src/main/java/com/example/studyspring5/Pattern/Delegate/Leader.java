package com.example.studyspring5.Pattern.Delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 11:25
 */
//项目经理类
public class Leader implements IEmployee{

    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader(){
        targets.put("加密",new IEmployeeA());
        targets.put("登录",new IEmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
