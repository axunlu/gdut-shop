package com.example.hot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = {"com.example.hot", "com.example.mysql"})
@ComponentScan(value = "com.example.*")
public class FreshShopHotApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreshShopHotApplication.class, args);
    }

}
