package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.domain.TestPOJO;

public interface TestMapper {
	
	public List<TestPOJO> get(Integer age);
	
	@Select("SELECT * FROM `info` where id = #{id};")
	public List<TestPOJO> getById(Integer id);

	public void addAll(List<TestPOJO> list);
}
