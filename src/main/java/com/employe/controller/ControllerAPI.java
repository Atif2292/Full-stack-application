package com.employe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI {

	@PostMapping("api/add")
	public ResponseEntity<String> addEmploye(){
		 return new ResponseEntity<>("Successfull", HttpStatus.CREATED);

	}
}
