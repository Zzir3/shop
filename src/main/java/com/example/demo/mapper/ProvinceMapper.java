package com.example.demo.mapper;

import com.example.demo.pojo.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProvinceMapper {
    public List<Province> findByProp(HashMap<String, Object> prop);
    //    Province getProvinceById(Integer id);
    public Province findById(Long id);
}
