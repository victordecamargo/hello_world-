package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/BSM-S")
	public String bsms() {
		return "***HABILIDADES*** "+" Trabalho em Equipe,"+" Orientação ao Detalhe,"+" Proatividade,"+" Comunicação,"
	+"***MENTALIDADES*** "+" Orientação ao Futuro,"+" Responsabilidade Pessoal,"+ " Mentalidade de Crescimento,"+" Persistencia ";
	}
	
	@GetMapping("/SEMANA")
	public String semana() {
		return "Essa semana aprenderei Spring. ";
	}


}
