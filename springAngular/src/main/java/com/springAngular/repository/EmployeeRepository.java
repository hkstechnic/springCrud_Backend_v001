package com.springAngular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springAngular.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
