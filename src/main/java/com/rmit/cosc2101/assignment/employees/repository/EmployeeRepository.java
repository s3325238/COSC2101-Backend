package com.rmit.cosc2101.assignment.employees.repository;

import com.rmit.cosc2101.assignment.employees.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EmployeeRepository
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> { }