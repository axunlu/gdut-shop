package com.example.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.goods.mapper.OrderInfoMapper;
import com.example.goods.pojo.OrderInfo;
import com.example.goods.service.OrderInfoService;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl< OrderInfoMapper, OrderInfo > implements OrderInfoService {

}