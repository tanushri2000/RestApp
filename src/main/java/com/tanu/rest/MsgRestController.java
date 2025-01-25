package com.tanu.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor-api")
public class MsgRestController {
	
	@GetMapping("/msg/{name}")
	public ResponseEntity<String> welcomeMsg(@PathVariable String name){
		String greeting="Welcome!"+name+" We're so glad to have you here. Please feel free to make yourself comfortable,and let us know if you need anything. Enjoy your time!";
		return new ResponseEntity<>(greeting,HttpStatus.OK);
	}

}
