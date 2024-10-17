package com.example.shopbanner.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.shopbanner.mapper.BannerMapper;
import com.example.shopbanner.pojo.Banner;
import com.example.shopbanner.service.BannerService;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements BannerService {

}
