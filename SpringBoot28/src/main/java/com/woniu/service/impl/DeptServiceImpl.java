package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.entity.Dept;
import com.woniu.mapper.DeptMapper;
import com.woniu.service.DeptService;


@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	DeptMapper deptMapper;
	
	
	@Override
	public List<Dept> findAll() {
		return deptMapper.selectByExample(null);
	}



}
