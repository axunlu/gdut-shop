package com.example.shopbanner.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luo Zhenhong
 * @description
 * @create 2024/10/18 15:18
 */
@RestController
@CrossOrigin
public class NewController {
    @GetMapping(value = "/home/new")
    public String getNew(){
        return s;
    }
    String s= "{\n" +
            "    \"code\": \"1\",\n" +
            "    \"msg\": \"操作成功\",\n" +
            "    \"result\": [\n" +
            "        {\n" +
            "            \"id\": \"4008506\",\n" +
            "            \"name\": \"平步青云财神家居摆件\",\n" +
            "            \"desc\": \"艺术家瞿广慈作品，手绘上色，礼盒包装\",\n" +
            "            \"price\": \"646.00\",\n" +
            "            \"picture\": \"https://yanxuan-item.nosdn.127.net/9d5d0083264344b5d85acde13570d025.jpg\",\n" +
            "            \"discount\": null,\n" +
            "            \"orderNum\": 60\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"3996270\",\n" +
            "            \"name\": \"超能装多功能出行胸包\",\n" +
            "            \"desc\": \"小身材，大容量，时尚出行\",\n" +
            "            \"price\": \"49.00\",\n" +
            "            \"picture\": \"https://yanxuan-item.nosdn.127.net/59b98ddea6422e71de8cec507865984f.png\",\n" +
            "            \"discount\": null,\n" +
            "            \"orderNum\": 15\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"4000464\",\n" +
            "            \"name\": \"趣玩奶酪纯PC拉链拉杆箱（14/20/24/26寸）\",\n" +
            "            \"desc\": \"萌趣外形，实用功能，开启愉快旅程\",\n" +
            "            \"price\": \"199.00\",\n" +
            "            \"picture\": \"https://yanxuan-item.nosdn.127.net/ee5ae3974a18a93f3f4704fe70075e10.png\",\n" +
            "            \"discount\": null,\n" +
            "            \"orderNum\": 38\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"3997974\",\n" +
            "            \"name\": \"入门首选，语音播报电子血压计\",\n" +
            "            \"desc\": \"全程语音指导，一键测量，监测心率，贴心守护爸妈健康\",\n" +
            "            \"price\": \"109.00\",\n" +
            "            \"picture\": \"https://yanxuan-item.nosdn.127.net/8f0c15f981c5cbcb1aa17215a259fa62.png\",\n" +
            "            \"discount\": null,\n" +
            "            \"orderNum\": 17\n" +
            "        }\n" +
            "    ]\n" +
            "}";
}
