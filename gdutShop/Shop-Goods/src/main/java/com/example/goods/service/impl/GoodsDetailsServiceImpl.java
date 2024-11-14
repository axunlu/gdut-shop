package com.example.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.goods.mapper.GoodsDetailsMapper;
import com.example.goods.pojo.GoodsDetails;
import com.example.goods.service.GoodsDetailsService;
import org.springframework.stereotype.Service;

@Service
public class GoodsDetailsServiceImpl extends ServiceImpl< GoodsDetailsMapper, GoodsDetails > implements GoodsDetailsService {

}