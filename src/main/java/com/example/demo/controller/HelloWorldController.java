package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.City;
import com.example.demo.service.CityService;

/**
 * Created by Administrator on 2018/10/1.
 */
@RestController
public class HelloWorldController {
	
 @Resource
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> cities () {
        return cityService.getAll();
    }

    @GetMapping("/city/{provinceId}")
    public City city(@PathVariable long provinceId) {
        return cityService.getByProvinceId(provinceId);
    }
	    
  @RequestMapping("/hello")
  public String sd() {
    System.out.println("000");
    return "Hello World";
  }
  @RequestMapping(value = { "/" }, method = { RequestMethod.GET })
  public String ndex() {
    System.out.println("000");
    return "forward:/index.html";
  }
  

}
