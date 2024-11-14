package com.example.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.goods.mapper.GoodsMapper;
import com.example.goods.pojo.Goods;
import com.example.goods.service.GoodsService;
import org.springframework.stereotype.Service;

@Service

public class GoodsServiceImpl extends ServiceImpl< GoodsMapper, Goods > implements GoodsService {
}
