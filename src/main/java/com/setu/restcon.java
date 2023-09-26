package com.setu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcon {
	@GetMapping("/get")
	public String toString() {
		
		String firstName = "Setu";
		String lastName = "Singh";
		String email = "setusingh665@gmail.com";
		String work = "Amdocs";
	    return String.format( firstName + " " +  lastName + "  " + email + " " + work );
	}
	
}
