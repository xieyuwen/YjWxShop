package com.yj.util;

import java.io.Serializable;

public class Result implements Serializable {


    private Integer code;
    private String msg="";
    private Object data="";


    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result auth(){
        return new Result(3,"暂无权限");
    }


    public static Result over(){
        return new Result(2,"token过期");
    }

    public static Result success(){
        return new Result(200,"成功");
    }

    public static Result success(String msg,Object data){
        return new Result(200,msg,data);
    }

    public static Result success(Object data){
        return new Result(200,"成功",data);
    }

    public static Result fail(){
        return new Result(500,"失败");
    }

    public static Result fail(String msg){
        return new Result(500,msg);
    }
    public static Result anewLogin(){
        return new Result(501,"登录过期，请重新登录");
    }
    public static Result anewLogin(String msg){
        return new Result(501,msg);
    }

    public static Result fail(Integer code,String msg){
        return new Result(code,msg);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
