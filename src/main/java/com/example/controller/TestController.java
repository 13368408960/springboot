package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.TestPOJO;
import com.example.service.TestServices;

import io.swagger.annotations.ApiOperation;

@RestController
public class TestController {

	@Autowired
    private TestServices testServices;
	
	@RequestMapping(value = "/show")
    public String show(){
        return testServices.show();
    }
	
	@ApiOperation(value="测试接口", notes="测试接口详细描述")
	@RequestMapping(value = "/api/path/",method=RequestMethod.POST)
    public String q11111(){
        return "888888888888";
    }

    @RequestMapping(value = "/showDao")
    public Object showDao(int age){
    	List<TestPOJO> list = testServices.showDao(age);
        return list;
    }
    
    
    @RequestMapping(value = "/getById")
    public Object getById(int id){
    	List<TestPOJO> list = testServices.getById(id);
        return list;
    }
    
    @RequestMapping(value = "/country/{country}")  
    public Object showDao(@PathVariable String country){
        return testServices.findByCountry(country);
    }
  
    @RequestMapping(value = "page")  
    public Object page(){
        return "page";
    }
    
    
    //批量添加
    @RequestMapping(value = "/pladd")  
    public List<TestPOJO> insertAll(){
    	List<TestPOJO> list = new ArrayList<TestPOJO>();
    	for (int i = 0; i < 5; i++) {
    		TestPOJO pojo = new TestPOJO();
    		pojo.setAge(1);
    		pojo.setId(1l);
    		pojo.setName("张三"+i);
    		list.add(pojo);
		}
    	testServices.addAll(list);
    	
    	return list;
       
    }
    
}
