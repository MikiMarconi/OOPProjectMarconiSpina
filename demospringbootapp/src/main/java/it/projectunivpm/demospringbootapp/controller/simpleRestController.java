package it.projectunivpm.demospringbootapp.controller;

import org.springframework.web.bind.annotation.*;

import it.projectunivpm.demospringbootapp.model.HelloWorldClass;

@RestController
public class simpleRestController {
	@GetMapping("/hello")
	public HelloWorldClass exampleMethod(@RequestParam(name="param1", defaultValue="World") String param1) {
		return new HelloWorldClass("michelangelo", "marconi");
	}
	
	@PostMapping("/hello")
	public HelloWorldClass exampleMethod2(@RequestBody HelloWorldClass body){
		return body;
	}
}
