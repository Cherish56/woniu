package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Dept;
import com.woniu.service.DeptService;

@Controller
public class DeptController {
	
	@Autowired
	DeptService deptService;

	@RequestMapping("list")
	public String list(Model model) {
		
		List<Dept> list=deptService.findAll();
		model.addAttribute("list", list);
		System.out.println("111111111111");
		return "list";
		
		
		
	}
}
