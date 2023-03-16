package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // Haz tu magia Spring
@RestController // Y además preparate para recibir peticiones https
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String hellow()
	{
		return "Hello World";
	}

	@RequestMapping("/hola")
	String holam()
	{
		return "Hola Mundo";
	}

	@RequestMapping("/mimedicacion")
	String miMedicacion()
	{
		return "tomate las pastillas";
	}
}
