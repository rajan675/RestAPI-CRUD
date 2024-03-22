package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.DAO.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
