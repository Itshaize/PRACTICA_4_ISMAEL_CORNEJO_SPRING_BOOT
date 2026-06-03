package com.productos.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.productos.app.models.Usuario;

@Controller
public class UsuarioController {
	@GetMapping(path = "/gestionUsuarios")
	
	public String gestionUsuarios(Model model) {
		Usuario usuario = new Usuario (1, "Ismael Cornejo", "1723456789", "icornejo@gmail.com", "icornejo123", 1, 2);
		model.addAttribute("Usuario", usuario);
		return "gestionUsuarios";
	}
}