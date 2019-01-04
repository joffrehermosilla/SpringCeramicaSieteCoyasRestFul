package com.ceramicasietecoyas.jhsinformaticsolutionsbackend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ceramicasietecoyas.jhsinformaticsolutionsbackend.model.Employee;
import com.ceramicasietecoyas.jhsinformaticsolutionsbackend.service.EmployeeService;







@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	
	
@GetMapping("/employee/{employeeId}")	
public Employee getEmployee(@PathVariable int employeeId) {
	return employeeService.getEmployee(employeeId);
}
	
@PostMapping("/employee")
public Employee saveEmployee(@RequestBody Employee employee) {
	return employeeService.save(employee);
}
//localhost:8085/ceramicasietecoyas-service/swagger-ui.html
	// localhost:8085/ceramicasietecoyas-service/employees

}
