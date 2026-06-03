package com.productos.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/saludo")
	public String holaMundo() {
		return "{\"mensaje\" : \"Hola desde Spring Boot\"}";
	}
}