package br.org.generation.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld2")
public class HelloWorld2 {

	@GetMapping
	public String helloWorld2() {
		return "Objetivos de Aprendizagem para essa semana:Estudar um pouco a cada dia para aprender Spring Boot, já que é uma coisa totalmente nova";
	}
}
