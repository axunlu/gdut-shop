package com.example.pcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = {"com.example.pcc", "com.example.mysql"})
public class FreshShopPccApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreshShopPccApplication.class, args);
    }

}
