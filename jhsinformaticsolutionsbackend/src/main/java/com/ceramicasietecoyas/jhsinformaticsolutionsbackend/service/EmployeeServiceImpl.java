package com.ceramicasietecoyas.jhsinformaticsolutionsbackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ceramicasietecoyas.jhsinformaticsolutionsbackend.model.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	private static List<Employee> employeeList = new ArrayList<>();
	static {
		employeeList.add(new Employee(1, "Shashi","HR"));
		employeeList.add(new Employee(2, "Anita","Admin"));
		employeeList.add(new Employee(3, "Saanvi","Travel"));
	}
	
	
	
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeList;
	}

	@Override
	public Employee getEmployee(int usuarioId) {
		// TODO Auto-generated method stub
		return employeeList.get(usuarioId-1);
	}

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		employeeList.add(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
