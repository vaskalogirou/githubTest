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

		int number = 1;
		number++;
		number = number + 2;
		number = number + 3;
		if (number > 123) {
			number = 123;
		} else {
			number = 321;
		}
		
		
		return "a new person was created";
	}
}
