package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// anotacion que define que es un controlador o que funciona como enrutador
@Controller
// define un endpoint de acceso base a la aplicacion mediante esta clase
@RequestMapping("/data")
public class Data {
	
	// define un sub endpoint dentro de el endpoint principal que se usa en este controlador
	@GetMapping("/data")
	public String Data() {
		
		// describe la ruta de la pagina que se va a mostrar al acceder al endpoint
		String endPointPage = "/pages/data";
		
		// retorna la pagina del endpoint
		return endPointPage;
	}

}
