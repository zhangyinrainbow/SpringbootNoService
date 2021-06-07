package com.cv.common;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result implements Serializable {
    private int code;
    private String msg;
    private Object data;
    public static Result succ(Object data){
        Result m =new Result();
        m.setCode(200);
        m.setData(data);
        m.setMsg("成功");
        return m;
    }
    public static Result succ(String mess,Object data){
        Result m = new Result();
        m.setData(data);
        m.setMsg(mess);
        m.setCode(200);
        return m;
    }
    public static Result fail(Object data){
        Result m = new Result();
        m.setCode(-1);
        m.setData(data);
        m.setMsg("失败");
        return m;
    }
    public static Result fail(String mess,Object data){
        Result m=new Result();
        m.setMsg(mess);
        m.setCode(-1);
        m.setData(data);
        return m;
    }
    public static Result fail(int code,String mess,Object data){
        Result m=new Result();
        m.setMsg(mess);
        m.setCode(code);
        m.setData(data);
        return m;
    }
}
