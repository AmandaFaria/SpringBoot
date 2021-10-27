package br.org.generation.helloworld1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld1")
public class HelloWorld1 {

	@GetMapping
	public String helloWorld1 () {
		return "Habilidade de atenção aos detalhes e mentalidade de persistência!";
	}
}
