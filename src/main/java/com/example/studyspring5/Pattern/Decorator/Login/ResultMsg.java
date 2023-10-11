package com.example.studyspring5.Pattern.Decorator.Login;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/8 8:24
 */
//结果集
public class ResultMsg {
    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Member data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
