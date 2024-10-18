package com.example.shopbanner.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luo Zhenhong
 * @description
 * @create 2024/10/18 15:24
 */
@RestController
@CrossOrigin
public class HotController  {
    @GetMapping(value = "/home/hot")
    public String getNew(){
        return s;
    }
    String s = "{\n" +
            "    \"code\": \"1\",\n" +
            "    \"msg\": \"操作成功\",\n" +
            "    \"result\": [\n" +
            "        {\n" +
            "            \"id\": \"1001\",\n" +
            "            \"picture\": \"https://yjy-oss-files.oss-cn-zhangjiakou.aliyuncs.com/tuxian/popular_1.jpg\",\n" +
            "            \"title\": \"特惠推荐\",\n" +
            "            \"alt\": \"它们最实惠\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1002\",\n" +
            "            \"picture\": \"https://yjy-oss-files.oss-cn-zhangjiakou.aliyuncs.com/tuxian/popular_2.jpg\",\n" +
            "            \"title\": \"爆款推荐\",\n" +
            "            \"alt\": \"它们最受欢迎\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1003\",\n" +
            "            \"picture\": \"https://yjy-oss-files.oss-cn-zhangjiakou.aliyuncs.com/tuxian/popular_3.jpg\",\n" +
            "            \"title\": \"一站买全\",\n" +
            "            \"alt\": \"使用场景下精心优选\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1004\",\n" +
            "            \"picture\": \"https://yjy-oss-files.oss-cn-zhangjiakou.aliyuncs.com/tuxian/popular_4.jpg\",\n" +
            "            \"title\": \"领券中心\",\n" +
            "            \"alt\": \"更多超值优惠券\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";
}
