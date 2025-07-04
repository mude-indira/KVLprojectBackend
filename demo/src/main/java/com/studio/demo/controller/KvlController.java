package com.studio.demo.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studio.demo.dto.KvlDto;
import com.studio.demo.service.KvlService;

import jakarta.validation.Valid;

@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
public class KvlController {
	 
	 @Autowired
	    private KvlService kvlService;
	 
	 @PostMapping("/signup")
	 //public String signup(@RequestBody @Valid KvlDto request) {--------> this is ok for running in postman
		//return  kvlService.register(request);
	 public ResponseEntity<?>  singup(@RequestBody @Valid KvlDto request) {//----------> for running in main signup page
		 String  result =kvlService.register(request);
		 return ResponseEntity.ok(result); 
		 
		 
	 }
	 
	 
	 @PostMapping("/login")
	 public ResponseEntity<?> login(@RequestBody KvlDto request) {
	     String logresult = kvlService.login(request);
	     if (logresult.equals("Login Successful")) {
	         return ResponseEntity.ok(request.getEmail()); 
	     } else {
	         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	     }
	 }
	 
	  
//	 @PostMapping("/login")
//	 public ResponseEntity<Map<String, String>> login(@RequestBody KvlDto request) {
//	     String logresult = kvlService.login(request);
//	     Map<String, String> response = new HashMap<>();
//	     response.put("message", logresult);
//	     return ResponseEntity.ok(response);
//	 }
	 @PutMapping("/reset")
	 public ResponseEntity<?> resertpassword(@RequestBody KvlDto request){
		 String password=kvlService.forgotpassword(request);
		 return ResponseEntity.ok(password);
	 }
		/*
		 * @PostMapping("/booking") public ResponseEntity<?> booking(@RequestBody KvlDto
		 * request){ String bookingevent=kvlService.bookEvent(request);
		 * 
		 * return ResponseEntity.ok(bookingevent);
		 * 
		 * }
		 */
	        
}
