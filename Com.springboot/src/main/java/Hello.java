//package com.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello{

	@RequestMapping("/home")
	public String sayHi() {
		return "I am a Home component";
		
	}

}


