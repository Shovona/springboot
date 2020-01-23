package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee_ID;

public interface Employee_Repository extends CrudRepository<Employee_ID,Integer>
{
	
}
