package com.everis.tarea.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareaJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaJavaApplication.class, args);
		String a = "Hola Mundo utilizando la herramienta SpringBoot";
		System.out.println(a);
	}

}
