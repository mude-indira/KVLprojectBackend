package com.studio.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studio.demo.dto.KvlDto1;

import com.studio.demo.service.BookingService;

@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
//	@PostMapping("/Booking")
//	public ResponseEntity<?> book(@RequestBody KvlDto1 response){
//		String booking =bookingService.bookingevent(response); 
//		
//		
//		
//		return ResponseEntity.ok(booking);
//		
//	}
	
	// ...existing code...
//	@PostMapping("/Booking")
//	public ResponseEntity<?> book(@RequestBody KvlDto1 response){
//	    String bookings = bookingService.bookingevent(response); 
//	    return ResponseEntity.ok(bookings);
//	}

	
	@PostMapping("/Booking")
	public ResponseEntity<String> saveBooking(@RequestBody KvlDto1 kvlDto1) {

	    String username = kvlDto1.getUsername();  // get it from the body now

	    if (username == null || username.isEmpty()) {
	        return ResponseEntity.status(401).body("Please enter username.");
	    }

	    String result = bookingService.bookingevent(kvlDto1, username);
	    return ResponseEntity.ok(result);
	}

	}
	

