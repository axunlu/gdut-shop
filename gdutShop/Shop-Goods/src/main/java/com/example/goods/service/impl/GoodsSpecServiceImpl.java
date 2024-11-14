package com.example.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.goods.mapper.GoodsSpecMapper;
import com.example.goods.pojo.GoodsSpec;
import com.example.goods.service.GoodsSpecService;
import org.springframework.stereotype.Service;

@Service
public class GoodsSpecServiceImpl extends ServiceImpl< GoodsSpecMapper, GoodsSpec > implements GoodsSpecService {

}