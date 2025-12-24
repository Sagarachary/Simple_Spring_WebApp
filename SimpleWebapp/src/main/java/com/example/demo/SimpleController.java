package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class SimpleController {
	
	@GetMapping("/msg")
	@ResponseBody
	
	public String greet() {
		return "Hello Wellcome to My First SpringBoot Simple Web app";
	}
}
