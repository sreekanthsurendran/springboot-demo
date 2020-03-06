package com.marlabs.democloudfoudry.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlabs.democloudfoudry.model.Employee;
import com.marlabs.democloudfoudry.repository.EmployeeRepository;

@Service	
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	
	public Employee getEmployee(Integer empId) {
		Optional<Employee> oe = employeeRepository.findById(empId);
		return oe.get();
		
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}


	@Override
	public void deleteEmployee(Integer empId) {
		employeeRepository.deleteById(empId);
		
	}


	@Override
	public Employee updateEmployee(Integer empId, Employee employee) {
		Optional<Employee> oe = employeeRepository.findById(empId);
		Employee emp = null;
		if (oe.isPresent()) {// Just to check whether it is there as it is an update flow.
			emp = employeeRepository.save(employee);
		}
		return emp;
	}
}
