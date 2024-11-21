package com.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mail.dto.MailDTO;
import com.mail.service.MailingService;


@Controller
@RequestMapping("/api/v1")
public class API {
	@Autowired
	private MailingService mailService;
	
	@PostMapping("/create")
	public ResponseEntity<MailDTO> addEmploye(@RequestBody MailDTO mail){
	MailDTO maildto =	mailService.addMail(mail);
		 return new ResponseEntity<MailDTO>(maildto, HttpStatus.CREATED);

	}

@GetMapping("/retriev/{employeId}")
public ResponseEntity<String> getEmploye(@PathVariable Long employeId ){
	return new ResponseEntity<>("Succesesfully mailed", HttpStatus.CREATED);
	
}
}