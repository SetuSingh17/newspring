package com.setu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcon {
	@GetMapping("/get")
	public String show() {
		return "Welcome to spring boot application";
	}
	

}
