package com.hexaware.restcrud.services;

import java.util.List;

import com.hexaware.restcrud.entities.Employee;

public interface IEmployeeServie {
	
	
	public Employee  insertEmployee(Employee employee);
	public Employee  updateEmployee(Employee employee);
	
	
	public  Employee  getEmloyeeById(Long eid);
	
	public void   deleteEmployeeById(Long eid);
	
	
	public Employee  getEmployeeByEname(String ename);
	
	
	public List<Employee>  getAllEmployees();
	
	public List<Employee> getEmployees();
	public List<Employee> getEmployeeSalaryGT(double salary);
	
	public List<Employee> getEmployeeSalary(double salary);
	
	

}
