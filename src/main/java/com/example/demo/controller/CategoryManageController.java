package com.example.demo.controller;

import com.example.demo.mapper.CategoryMapper;

import com.example.demo.pojo.Category;

import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;



import java.util.HashMap;

import java.util.List;



@Controller   //servlet  doget  dopost   request  response

public class CategoryManageController {

    @Autowired

    private CategoryMapper categoryMapper;



    @GetMapping("/category/manage")

    public String categoryManage(Model model,

                                 @RequestParam(value = "qInfo", required = false, defaultValue = "%") String qInfo,

                                 @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,

                                 @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize

    ) {

//        System.out.println(qInfo);

       PageHelper.startPage(pageNum, pageSize);//分页起始码以及每页页数

//        封装查询条件，包括按编码模糊，按类型名称模糊，排序，根据每页显示数进行查询

        HashMap<String, Object> prop = new HashMap<>();

        //    内部编码中含“4”，如FL0004,FL0014

       prop.put("code", qInfo);

//        名称中含“用”

      prop.put("aname", qInfo);

        List<Category> categories = categoryMapper.findByProp(prop);

              PageInfo pageInfo = new PageInfo(categories);

        model.addAttribute("data", pageInfo );

        return "admin/categoryManage";

    }





    @GetMapping("/category/update")

    public String categoryUpdate(Model model, Category category) {

        System.out.println(category);

//        如果ID为空，则新增，否则为修改，这个位置有可能报类型不兼容的错误，int   ---  String，可以用0代替null进行匹配判断

        if (category.getId()==null) {

            categoryMapper.insert(category);

        } else {

            categoryMapper.update(category);

        }

//        重定向

        return "redirect:/category/manage";

    }

}