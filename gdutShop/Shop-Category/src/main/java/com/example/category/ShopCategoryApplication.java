package com.example.category;

import com.example.shopmysql.config.MyBatisPlusConfig;
import com.example.shopmysql.config.MyMetaObjectHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({MyBatisPlusConfig.class, MyMetaObjectHandler.class})
public class ShopCategoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopCategoryApplication.class, args);
    }

}
