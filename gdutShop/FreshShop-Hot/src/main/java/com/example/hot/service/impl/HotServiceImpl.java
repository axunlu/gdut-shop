package com.example.hot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hot.mapper.HotMapper;
import com.example.hot.pojo.Hot;
import com.example.hot.service.HotService;
import org.springframework.stereotype.Service;

@Service
public class HotServiceImpl extends ServiceImpl< HotMapper, Hot > implements HotService {

}
