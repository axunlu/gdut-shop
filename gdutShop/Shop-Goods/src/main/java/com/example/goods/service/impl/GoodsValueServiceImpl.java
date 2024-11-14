package com.example.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.goods.mapper.GoodsValueMapper;
import com.example.goods.pojo.GoodsValue;
import com.example.goods.service.GoodsValueService;
import org.springframework.stereotype.Service;

@Service
public class GoodsValueServiceImpl extends ServiceImpl< GoodsValueMapper, GoodsValue > implements GoodsValueService {

}