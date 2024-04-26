package com.example.demo.mapper;

import com.example.demo.pojo.Region;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface RegionMapper {
    public List<Region> findByProp(HashMap<String, Object> prop);
    public Region findById(Long id);
}