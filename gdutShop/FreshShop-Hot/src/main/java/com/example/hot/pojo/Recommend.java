package com.example.hot.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(autoResultMap = true)
public class Recommend {
    @TableId(type = IdType.AUTO)
    private Integer recommendId;
    private String bannerPicture;
    private String recommendTitle;
    private String typeId;
}
