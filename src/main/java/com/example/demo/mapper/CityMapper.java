package com.example.demo.mapper;

import com.example.demo.pojo.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CityMapper {
    public List<City> findByProp(HashMap<String, Object> prop);
    public City findById(Long id);
}
