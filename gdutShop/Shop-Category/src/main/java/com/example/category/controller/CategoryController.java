package com.example.category.controller;

import com.example.category.common.R;
import com.example.category.pojo.Category;
import com.example.category.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category/")
@Tag(name = "显示分类", description = "分类管理相关接口，包括增删改查操作")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 获取所有分类
     *
     * @return 包含所有分类信息的响应结果
     */
    @Operation(summary = "获得所有的分类", description = "获取系统中的所有分类信息")
    @GetMapping(value = "/getAllCategory")
    public R getAllCategory() {
        List<Category> category = categoryService.list();
        return R.ok("查询所有分类成功").data("category", category);
    }

    /**
     * 增加新的分类
     *
     * @param category 要添加的分类对象
     * @return 增加分类的操作结果
     */
    @Operation(summary = "增加分类", description = "添加一个新的分类信息")
    @PostMapping(value = "/addCategory")
    public R addCategory(@RequestBody Category category) {
        boolean flag = categoryService.save(category);
        if (flag) {
            return R.ok("增加分类成功");
        } else {
            return R.error("增加分类失败");
        }
    }

    /**
     * 删除指定 ID 的分类
     *
     * @param bannerId 分类 ID
     * @return 删除分类的操作结果
     */
    @Operation(summary = "删除分类数据", description = "根据分类的 ID 删除对应的分类信息")
    @DeleteMapping(value = "/deleteCategory/{id}")
    public R deleteCategory(@PathVariable("id") Integer bannerId) {
        boolean flag = categoryService.removeById(bannerId);
        if (flag) {
            return R.ok("删除分类成功");
        } else {
            return R.error("删除分类失败");
        }
    }

    /**
     * 根据分类 ID 查询分类
     *
     * @param bannerId 分类 ID
     * @return 查询到的分类信息
     */
    @Operation(summary = "按照分类编号查询数据", description = "根据分类的 ID 获取分类信息")
    @GetMapping(value = "/getCategoryById/{id}")
    public R getByIdCategory(@PathVariable("id") Integer bannerId) {
        Category category = categoryService.getById(bannerId);
        return R.ok("按照分类编号查询数据成功").data("banner", category);
    }

    /**
     * 更新分类信息
     *
     * @param category 包含更新信息的分类对象
     * @return 更新分类的操作结果
     */
    @Operation(summary = "修改分类数据", description = "更新指定分类的信息")
    @PutMapping(value = "/updateCategory")
    public R updateCategory(@RequestBody Category category) {
        boolean flag = categoryService.updateById(category);
        if (flag) {
            return R.ok("修改分类成功");
        } else {
            return R.error("修改分类失败");
        }
    }
}
