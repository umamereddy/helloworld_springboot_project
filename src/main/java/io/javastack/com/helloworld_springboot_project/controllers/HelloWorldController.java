package io.javastack.com.helloworld_springboot_project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello-world")
	public String hello() {
		return "Hello World";
		
	}

}
