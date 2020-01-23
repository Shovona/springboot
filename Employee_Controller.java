package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Employee_Repository;
import com.example.demo.model.Employee_ID;

@Controller
public class Employee_Controller 
{
	@Autowired
	Employee_Repository repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee_ID emp)
	{
		repo.save(emp);
		return "home.jsp";
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam int emp_id)
	{
		ModelAndView mv=new ModelAndView("view.jsp");
		Employee_ID emp=repo.findById(emp_id).orElse(new Employee_ID());
		mv.addObject(emp);
		return mv;
	}
}
