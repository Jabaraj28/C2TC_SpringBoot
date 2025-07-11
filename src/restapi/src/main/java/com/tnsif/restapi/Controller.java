package com.tnsif.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/Hello")
	public String welcome() {
		return "hi coders....... welcome for the restful session";
	}
	@GetMapping("/hello/{name}")
	public String Greet(@PathVariable String name)
	{
		return "hello"+"wellcome";
	}
	
	@GetMapping("/hello")
	public String message (@RequestParam String name)
	{
		return"Message is "+ name;
	}

}
