package com.example.hot.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.example.goods.pojo.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.TypeHandler;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(autoResultMap = true)
public class Hot {
    @TableId(type = IdType.AUTO)
    private Integer hotId;
    private Integer hotPicturesId;
    private String hotTitle;
    private String hotAlt;
    private Integer hotTarget;
    private Integer hotType;
}
