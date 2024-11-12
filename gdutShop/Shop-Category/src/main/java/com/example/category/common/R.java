package com.example.category.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {
    private boolean flag; // 是否成功
    private Integer code; // 返回码
    private String message; // 返回信息
    private Map< String, Object > data = new HashMap<>(); // 返回数据

    //成功时调用方法
    public static R ok(String message) {
        R r = new R();
        r.setFlag(true);
        r.setCode(ResultCode.OK);
        r.setMessage(message);
        return r;
    }

    //失败时调用方法
    public static R error(String message) {
        R r = new R();
        r.setFlag(true);
        r.setCode(ResultCode.ERROR);
        r.setMessage(message);
        return r;
    }

    public R flag(boolean flag) {
        this.setFlag(flag);
        return this;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public R data(Map< String, Object > data) {
        this.setData(data);
        return this;
    }
}
