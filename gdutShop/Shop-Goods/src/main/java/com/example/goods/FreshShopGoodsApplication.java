package com.example.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = {"com.example.goods", "com.example.mysql"})
public class FreshShopGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreshShopGoodsApplication.class, args);
    }

}
