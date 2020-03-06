package com.marlabs.democloudfoudry.repository;

import org.springframework.data.repository.CrudRepository;

import com.marlabs.democloudfoudry.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
