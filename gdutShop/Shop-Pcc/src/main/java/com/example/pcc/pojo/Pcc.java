package com.example.pcc.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pcc {
    @TableId(type = IdType.AUTO)
    private Integer pccId;
    private String pccName;
    private String pccPicture;
    private Integer pccLayer;
    private Integer pccParent;
}
