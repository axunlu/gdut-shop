package com.example.category.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.category.mapper.CategoryMapper;
import com.example.category.pojo.Category;
import com.example.category.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl< CategoryMapper, Category > implements CategoryService {

}
