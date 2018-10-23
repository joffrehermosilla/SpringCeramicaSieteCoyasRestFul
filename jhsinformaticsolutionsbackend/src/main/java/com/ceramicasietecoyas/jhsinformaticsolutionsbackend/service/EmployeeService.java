package com.ceramicasietecoyas.jhsinformaticsolutionsbackend.service;
 import java.util.List;

import com.ceramicasietecoyas.jhsinformaticsolutionsbackend.model.*;
public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public Employee getEmployee(int usuarioId);
	
	public Employee save(Employee employee);
	
	public Employee updateEmployee();
	
	
	
}
