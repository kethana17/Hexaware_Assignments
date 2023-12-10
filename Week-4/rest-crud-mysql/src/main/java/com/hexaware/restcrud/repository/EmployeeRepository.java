package com.hexaware.restcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.restcrud.entities.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
	
	
				public Employee   findByEname(String ename); // select * from Employee_Details where ename =?;
				
				//public Employee  findBySalary(double salary);
				
				public List<Employee> findBySalaryGreaterThan(double salary);
				
				public List<Employee> findBySalaryLessThan(double salary);
				
				public List<Employee> getEmployeesSorted(double salary);
				
				

}