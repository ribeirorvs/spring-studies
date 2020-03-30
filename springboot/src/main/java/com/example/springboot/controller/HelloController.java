/**
 * 
 */
package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roribeir
 *
 */
@RestController
public class HelloController {
	
	@GetMapping("/")
	public String helloMessage() {
		return "Hello, world!";
	}

}
