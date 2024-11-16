package com.example.pcc.controller;

import com.example.pcc.pojo.Pcc;
import com.example.pcc.service.PccService;
import com.example.smartcommon.util.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pcc/")
@Tag(name = "显示商品子分类")
public class PccController {
    @Autowired
    private PccService pccService;

    @Operation(summary = "获得所有的商品子分类")
    @GetMapping(value = "/getAllPcc")
    public R getAllPcc() {
        List< Pcc > pccList = pccService.list();
        for (Pcc pcc : pccList) {
            pcc.setPccParent(null);
        }
        return R.ok("查询所有商品子分类成功").data("pccList", pccList);
    }

    @Operation(summary = "增加商品子分类")
    @PostMapping(value = "/addPcc")
    public R addPcc(@RequestBody Pcc pcc) {
        pcc.setPccParent(null);
        boolean flag = pccService.save(pcc);
        if (flag) {
            return R.ok("增加商品子分类成功");
        } else {
            return R.error("增加商品子分类失败");
        }
    }

    @Operation(summary = "删除商品子分类数据")
    @DeleteMapping(value = "/deletePcc/{id}")
    public R deletePcc(@PathVariable("id") Integer pccId) {
        boolean flag = pccService.removeById(pccId);
        if (flag) {
            return R.ok("删除商品子分类成功");
        } else {
            return R.error("删除商品子分类失败");
        }
    }

    @Operation(summary = "按照商品子分类编号查询数据")
    @GetMapping(value = "/getPccById/{id}")
    public R getByIdPcc(@PathVariable("id") Integer pccId) {
        Pcc pcc = pccService.getById(pccId);
        return R.ok("按照商品子分类编号查询数据成功").data("pcc", pcc);
    }

    @Operation(summary = "修改商品子分类数据")
    @PutMapping(value = "/updatePcc")
    public R updatePcc(@RequestBody Pcc pcc) {
        boolean flag = pccService.updateById(pcc);
        if (flag) {
            return R.ok("修改商品子分类成功");
        } else {
            return R.error("修改商品子分类失败");
        }
    }
}
