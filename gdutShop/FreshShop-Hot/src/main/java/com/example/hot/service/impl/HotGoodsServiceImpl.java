package com.example.hot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hot.mapper.HotGoodsMapper;
import com.example.hot.pojo.HotGoods;
import com.example.hot.service.HotGoodsService;
import org.springframework.stereotype.Service;

@Service
public class HotGoodsServiceImpl extends ServiceImpl< HotGoodsMapper, HotGoods > implements HotGoodsService {
}
