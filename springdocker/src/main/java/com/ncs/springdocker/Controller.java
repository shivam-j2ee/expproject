package com.ncs.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/test")
	public String test() {

		return "Docker Test Run Successfully";
	}

}
