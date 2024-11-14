package com.example.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.goods.mapper.GoodsPropertyMapper;
import com.example.goods.pojo.GoodsProperty;
import com.example.goods.service.GoodsPropertyService;
import org.springframework.stereotype.Service;

@Service
public class GoodsPropertyServiceImpl extends ServiceImpl< GoodsPropertyMapper, GoodsProperty > implements GoodsPropertyService {

}