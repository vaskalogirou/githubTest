package com.kalogirou.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalogirou.test.domain.Person;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello baby";
	}

	@RequestMapping("users")
	public String users() {
		Person person = new Person();
		person.setName("vasilis");
		return "a new person was created";
	}
}
