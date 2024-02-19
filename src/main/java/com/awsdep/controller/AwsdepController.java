package com.awsdep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsdepController {
	
	@GetMapping(path ="/getMsg") 
		public String getMessage() {
		return "Hello Nisha Mam";
		
	}

}
