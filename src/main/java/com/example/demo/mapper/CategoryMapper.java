package com.example.demo.mapper;




import com.example.demo.pojo.Category;

import org.apache.ibatis.annotations.*;



import java.util.HashMap;

import java.util.List;
@Mapper

public interface CategoryMapper {
    //    精确查询



    public Category findById(int id);  //注意Category有二个包中有，选你自己的包中的



    //    模糊查询

    public List<Category> findByProp(HashMap<String, Object> prop);



    //    添加（需要根据表的各种约束正确编写sql语句）



    public int insert(Category category);



    //    删除



    public int delete(int id);



    //    修改


    public int update(Category category);

}




