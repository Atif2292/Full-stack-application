package com.employe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employe.dto.EmployeDTO;
import com.employe.service.EmployeService;

@RestController
@RequestMapping("api/v1/")
public class ControllerAPI {

	@Autowired
	private EmployeService employeService;
	
	@PostMapping("api/create")
	public ResponseEntity<EmployeDTO> addEmploye(@RequestBody EmployeDTO employe){
	EmployeDTO emp =	employeService.addEmploye(employe);
		 return new ResponseEntity<EmployeDTO>(emp, HttpStatus.CREATED);

	}
	@GetMapping("api/retrieve/{employeId}")
	public ResponseEntity<EmployeDTO> getEmploye(@PathVariable Long employeId ){
		EmployeDTO getemp =    employeService.getEmploye(employeId);
		return new ResponseEntity<EmployeDTO>(getemp, HttpStatus.CREATED);
		
	}
	@PutMapping("api/update/{employeId}")
	public ResponseEntity<EmployeDTO> updateEmploye(@PathVariable Long employeId,@RequestBody EmployeDTO employe){
	EmployeDTO emp =	employeService.updateEmploye(employeId, employe);
		 return new ResponseEntity<EmployeDTO>(emp, HttpStatus.CREATED);
	}
	@DeleteMapping("api/delete/{employeId}")
	public boolean deleteEmploye(@PathVariable Long employeId){
		   employeService.deleteEmploye(employeId);
		return true;
		
	}
}
