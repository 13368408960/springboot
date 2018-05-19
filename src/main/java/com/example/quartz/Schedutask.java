package com.example.quartz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.example.domain.TestPOJO;
import com.example.mapper.TestMapper;
import com.example.service.TestServices;
import com.example.util.SpringUtil;


/***
 * 
 * Quartz设置项目全局的定时任务
 * 
 * @Component注解的意义        泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。一般公共的方法我会用上这个注解
 * 
 * 
 * @author WQ
 *
 */
@Component
@Service
public class Schedutask {
	
	@Autowired
    private TestMapper testMapper;
    
    @Scheduled(cron = "0/2 * * * * ?") //每2秒执行一次
    public void doSomething() throws Exception {
    	
    	
    	
    	List<TestPOJO> list = testMapper.getById(1);
    	TestPOJO t = list.get(0);
    	
    	System.out.println(list.size()+t.getName());
        System.out.println("每2秒执行一个的定时任务："+new Date());
    }
    
}