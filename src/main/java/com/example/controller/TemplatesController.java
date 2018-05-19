package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplatesController {

	@RequestMapping("/index2")  
    public String test(HttpServletRequest request) {  
        //逻辑处理  
		request.setAttribute("key", "hello world index1"); 
        return "index2"; 
	}  
	
	
	/** 
     * 首页 
     * @return 
     */  
    @RequestMapping("/index")  
    public String page(HttpServletRequest request){  
    	request.setAttribute("key", "hello world index"); 
        return "index";  
    } 
}
