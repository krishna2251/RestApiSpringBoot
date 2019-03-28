package com.dmantznr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmantznr.model.Employee;
import com.dmantznr.repository.EmployeeRepository;

@RestController
@RequestMapping("/")
public class EmployeeController {

	
	

		@Autowired
		private EmployeeRepository employeeRepository;

		@PostMapping("/addemp")
		public String saveEmployee(@RequestBody Employee employee) {
			employeeRepository.save(employee);  
			return "Added emp with id : " + employee.getId();

		}
	 
	/*
	 * @GetMapping("/findAllemployees") public List<Employee> getBooks() { return
	 * employeeRepository.findAll(); }
	 */
		@PutMapping("/update/{id}")
		public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
			employeeRepository.save(employee);
		}
		@GetMapping("/findAllemployees/{id}")
		public Optional<Employee> getBook(@PathVariable int id){     
			return employeeRepository.findById(id);
			
		}
		@DeleteMapping("/delete/{id}")
		public String deleteemployee(@PathVariable int id) {
			employeeRepository.deleteById(id);
			return "employee deleted by id :"+id;
		}

	}


