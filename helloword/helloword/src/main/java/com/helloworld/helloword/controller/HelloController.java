package com.helloworld.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")

public class HelloController 
{
	@GetMapping
	public String hello()
	{
		return "Hello World";
	}
 
	@GetMapping("/2")
	public String hello2() {
		return "Bora que Bora, Família 41!";
	}
	
	@GetMapping("/habilidade/mentalidade")
	public String habMent() {
		return "Utilizei a mentalidade para conseguir concluir essa atividade.";
	}
	
	@GetMapping("/objetivos/aprendizagem")
	public String objAprend() {
		return "Essa semana o meu objetivo de aprendizagem é manter a minha persistência e melhorar muito a minha mentalidade de crescimento.";
	}
}