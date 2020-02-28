package com.project.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.bussiness_logic.DataGenerator;

@Controller
@RequestMapping
public class DataModel {
	
	@GetMapping("/data_model")
	public String modelo(Model model) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/model";
		String captureVariableName = "captureVariableName";
		
		// obtiene la lista en al variable usando la funcion de la clase
		ArrayList<?> dataFont = (ArrayList<?>) DataGenerator.dataLanguages();
		
		// define el nombre de la variable que va a ser capturada en la pagina
		// se envia los datos que se van a leer por intermedio de la variable definida
		model.addAttribute(captureVariableName,dataFont);
		
		// retorna la pagina a mostrar
		return endPointPage;
	}

}