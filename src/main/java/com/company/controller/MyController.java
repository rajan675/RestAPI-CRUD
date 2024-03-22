package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.DAO.Employee;
import com.company.DAO.EmployeeDAO;

@RestController
public class MyController {
	@Autowired
	EmployeeDAO dao;
	@PostMapping("insert")
	public Employee insert(@RequestBody Employee e) {
		return dao.insert(e);
		
	}
	@GetMapping("view")
	public List<Employee> getAll() {
		return dao.getAll();
	
	}
	@GetMapping("view/{id}")
	public Employee getByID(@PathVariable int id) {
		return dao.getByID(id);
	}
	@DeleteMapping("delete/{id}")
	public void deleteByID(@PathVariable int  id) {
		
		 dao.deleteByID(id);
	}
	@PutMapping("update/{id}")
	public Employee updateById(@PathVariable int id, @RequestBody Employee e) {
		e.setId(id);
		return dao.updateById(e);
	}
	
	
}
