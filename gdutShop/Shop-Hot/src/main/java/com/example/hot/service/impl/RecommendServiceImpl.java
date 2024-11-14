package com.example.hot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hot.mapper.RecommendMapper;
import com.example.hot.pojo.Recommend;
import com.example.hot.service.RecommendService;
import org.springframework.stereotype.Service;

@Service
public class RecommendServiceImpl extends ServiceImpl< RecommendMapper, Recommend > implements RecommendService {

}
