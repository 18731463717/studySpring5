package com.example.studyspring5.Pattern.Adapter.lander;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 18:52
 */
//统一返回结果集
public class ResultMsg {
    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Object data) {
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
