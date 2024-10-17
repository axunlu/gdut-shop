package com.example.shopbanner.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class R {
    private String code; // 返回码
    private String msg; // 返回信息
    private List<BannerDTO> result = new ArrayList<>(); // 返回数据

    //成功时调用方法
    public static R ok(String message) {
        R r = new R();
        r.setCode("1");
        r.setMsg(message);
        return r;
    }

    public static R ok(String message, List<BannerDTO> result) {
        R r = new R();
        r.setCode("1");
        r.setMsg(message);
        r.setResult(result);
        return r;
    }

    //失败时调用方法
    public static R error(String message) {
        R r = new R();
        r.setCode("0");
        r.setMsg(message);
        return r;
    }
}
