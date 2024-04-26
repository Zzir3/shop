package com.example.demo;

import com.example.demo.mapper.CategoryMapper;
import com.example.demo.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTest {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void testFindById(){
        Category category = categoryMapper.findById(20003);
        System.out.println(category);
    }
    @Test
    public void testFindByProp(){
        HashMap<String,Object> prop = new HashMap<>();
        prop.put("code","4");
        prop.put("aname","用");
        prop.put("start",(1-1)*10);
        prop.put("pageSize",10);
        List<Category> categories=categoryMapper.findByProp(prop);
        System.out.println(categories);
    }
@Test
    public void testInsert(){
        Category category = new Category();
        category.setAname("测试分类");
        category.setCode("t00210");
        category.setPid(20000);
        category.setIsShow('1');
     categoryMapper.insert(category);
}
@Test
    public void testUpdate(){
        Category category = categoryMapper.findById(20019);
        System.out.println("修改前:");
        System.out.println(category);
        category.setAname("test category");
        category.setIsShow('1');
        categoryMapper.update(category);
        System.out.println("修改后:");
        System.out.println(categoryMapper.findById(20019));


        }
@Test
    public void testDelete(){
        categoryMapper.delete(20018);
}
}

