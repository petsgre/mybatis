package com.example.demo.mapper;

import java.util.List;

import com.example.demo.domain.City;


//@Mapper
public interface CityMapper {

  City findByProvinceId(Long provinceId);

  List<City> findAll();
}