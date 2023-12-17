package com.employeecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeecare.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findById(long id);
	Employee findByEmail(String email);

}