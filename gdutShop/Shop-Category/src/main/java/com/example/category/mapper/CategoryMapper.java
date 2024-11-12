package com.example.category.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.category.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper< Category > {
}
