package com.example.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.goods.mapper.OrderSpecMapper;
import com.example.goods.pojo.OrderSpec;
import com.example.goods.service.OrderSpecService;
import org.springframework.stereotype.Service;

@Service
public class OrderSpecServiceImpl extends ServiceImpl< OrderSpecMapper, OrderSpec > implements OrderSpecService {

}