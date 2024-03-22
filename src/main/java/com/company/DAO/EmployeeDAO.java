package com.company.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.repository.EmployeeRepo;
@Service
public class EmployeeDAO {
	@Autowired
EmployeeRepo repo;
	
	
	public Employee insert(Employee e) {
		return repo.save(e);
		
	}
	public List<Employee> getAll() {
		return repo.findAll();
	}
	
	public Employee getByID(int id) {
		return repo.findById(id).orElse(null);
	}
	public void deleteByID(int id) {
		 repo.deleteById(id);
	}
	public Employee updateById(Employee e) {
		return repo.save(e);
	}
	
}
