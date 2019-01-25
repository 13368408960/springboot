package com.example;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

//@EnableScheduling
@SpringBootApplication
@MapperScan("com.example.mapper")
@Slf4j
public class Application {
	


    
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("SpringBoot Start Success");
	}
}
