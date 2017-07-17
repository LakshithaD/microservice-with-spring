package com.lak.poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User name() {
		
		System.out.println("************** Serving request");
		return new User("Kamal", "Amal", "USR_001");
	}
}
