package com.example.demo.mapper;

import com.example.demo.pojo.Town;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface TownMapper {
    public List<Town> findByProp(HashMap<String, Object> prop);
    public Town findById(Long id);
}
