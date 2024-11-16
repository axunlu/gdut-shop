package com.example.pcc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pcc.mapper.PccMapper;
import com.example.pcc.pojo.Pcc;
import com.example.pcc.service.PccService;
import org.springframework.stereotype.Service;

@Service
public class PccServiceImpl extends ServiceImpl< PccMapper, Pcc > implements PccService {
}
