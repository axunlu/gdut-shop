package com.example.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.goods.mapper.GoodsBrandMapper;
import com.example.goods.pojo.GoodsBrand;
import com.example.goods.service.GoodsBrandService;
import org.springframework.stereotype.Service;

@Service
public class GoodsBrandServiceImpl extends ServiceImpl< GoodsBrandMapper, GoodsBrand > implements GoodsBrandService {

}