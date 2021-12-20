package com.ncs.WebClient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

@SpringBootApplication
public class WebClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebClient1Application.class, args);
	}
	
	//WebClient.Builder web= WebClient.builder();
	
	@Bean
	public WebClient.Builder getWebclientBuilder(){
		return WebClient.builder();
	}

}
