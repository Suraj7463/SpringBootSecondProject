package com.tcs.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public ResponseEntity<String> showMassage(){
		String msg="Welcome To Our Collage";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	

}
