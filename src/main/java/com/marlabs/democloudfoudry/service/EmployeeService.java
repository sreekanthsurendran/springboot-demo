package com.marlabs.democloudfoudry.service;

import java.util.List;

import com.marlabs.democloudfoudry.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public Employee getEmployee(Integer empId);
	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Integer empId, Employee employee);
	
	public void deleteEmployee(Integer empId);
}
