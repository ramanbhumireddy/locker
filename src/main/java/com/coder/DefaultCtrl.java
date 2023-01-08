package com.coder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultCtrl {
	
	@GetMapping(value = "/msg")
	public String getMethodName() {
		return "Hello";
	}

	
}
