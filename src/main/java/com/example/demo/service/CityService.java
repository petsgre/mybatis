package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.City;

public interface CityService {

    City getByProvinceId(Long provinceId);

    List<City> getAll();

}