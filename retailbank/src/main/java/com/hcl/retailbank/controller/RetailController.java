package com.hcl.retailbank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retailbanking")
public class RetailController {
	
	@PostMapping("/customerregistration")
	public ResponseEntity<String> customerRegistration(@RequestBody CustomerCreation customer){
		customerServiceImpl.customerRegistration(customer);
		new ResponseEntity<String>("Customer Registered successfully",HttpStatus.OK);
	}

}
