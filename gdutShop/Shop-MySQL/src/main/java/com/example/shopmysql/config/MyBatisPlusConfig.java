package com.example.shopmysql.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import com.baomidou.mybatisplus.extension.incrementer.PostgreKeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.JoinInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.KeyGeneratorInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisPlusConfig {
    @Bean
    public IKeyGenerator keyGenerator() {
        //主键生成器
        return new PostgreKeyGenerator();
    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //分页插件
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        //join插件
        interceptor.addInnerInterceptor(new JoinInterceptor());
        //需要依赖此拦截器   序列自增插件
        interceptor.addInnerInterceptor(new KeyGeneratorInterceptor());
        return interceptor;
    }
}
