package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.domain.City;
import com.example.demo.mapper.CityMapper;


@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityMapper cityMapper;

    @Override
    public City getByProvinceId(Long provinceId) {
        return cityMapper.findByProvinceId(provinceId);
    }

    @Override
    public List<City> getAll() {
        return cityMapper.findAll();
    }
}