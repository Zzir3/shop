package com.example.demo.mapper;

import com.example.demo.pojo.Street;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface StreetMapper {
    public List<Street> findByProp(HashMap<String, Object> prop);
    public Street findById(Long id);
}
