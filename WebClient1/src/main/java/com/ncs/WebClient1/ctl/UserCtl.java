package com.ncs.WebClient1.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/ctl")
public class UserCtl {

	@Autowired
	private WebClient.Builder webBuilder;
	
	@GetMapping("/test")
	public String test(UserDTO dto) {
		
		String student=webBuilder.build()
								.post()//get()
								.uri("http://localhost:8082/ctl/student")
								.body(Mono.just(dto),UserDTO.class)
								.retrieve()
								.bodyToMono(String.class)
								.block();
		
		return "Hello User this is "+student;
	}
}
