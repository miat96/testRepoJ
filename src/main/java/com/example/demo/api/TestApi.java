package com.example.demo.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestApi {
	
	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public ResponseEntity<?> getHelloWorld(){
		
		return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body("Hello World");
	}

}
