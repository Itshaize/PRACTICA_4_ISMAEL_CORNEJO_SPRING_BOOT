package com.productos.app.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.productos.app.models.Usuario;

@RestController
@RequestMapping("/api/v1")
public class UsuarioRestController {
	@RequestMapping(path="/usuarios", method=RequestMethod.GET)
	
	public Map<String, Object> getUsuarios(){
		Usuario usuario = new Usuario (1, "Ismael Cornejo", "1723456789", "icornejo@gmail.com", "icornejo123", 1, 2);
		Map<String, Object> respuesta=new HashMap<>();
		respuesta.put("Usuario", usuario);
		return respuesta;
	}
}