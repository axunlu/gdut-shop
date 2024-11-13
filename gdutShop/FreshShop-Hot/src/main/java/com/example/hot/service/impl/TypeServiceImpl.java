package com.example.hot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hot.mapper.TypeMapper;
import com.example.hot.pojo.Type;
import com.example.hot.service.TypeService;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl extends ServiceImpl< TypeMapper, Type > implements TypeService {

}
