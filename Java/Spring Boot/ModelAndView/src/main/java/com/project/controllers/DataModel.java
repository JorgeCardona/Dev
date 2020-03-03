package com.project.controllers;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.bussiness_logic.DataGenerator;


@Controller
@RequestMapping("/data")
public class DataModel {
	
	@GetMapping("/model")
	public String modelo(Model model, @RequestParam (defaultValue = "0", name = "id", required = false) int id) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/model";
		String captureVariableName = "captureVariableName";
		
		// obtiene la lista en al variable usando la funcion de la clase
		ArrayList<?> dataFont = (ArrayList<?>) DataGenerator.dataLanguages(id);
		
		// define el nombre de la variable que va a ser capturada en la pagina
		// se envia los datos que se van a leer por intermedio de la variable definida
		model.addAttribute(captureVariableName,dataFont);
		
		// retorna la pagina a mostrar
		return endPointPage;
	}	
	
	// en el @RequestParam el parametro name = "xyz", el nombre xyz es la variable a la que se le asigna valor en el navegador pára que filtre
	// despues del @RequestParam se debe indicar el tipo de dato y luego el nombre de la variable que se le va a pasar a la funcion.
	@GetMapping("/menu")
	public String list(Model model,  @RequestParam (defaultValue = "false" , name = "vegetarian", required = false) Boolean vegetarian) {
				
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/menu";
		String captureVariableName = "captureVariableName";
		
		// obtiene la lista en al variable usando la funcion de la clase
		ArrayList<?> dataFont = (ArrayList<?>) DataGenerator.menutypes(vegetarian);
		
		// define el nombre de la variable que va a ser capturada en la pagina
		// se envia los datos que se van a leer por intermedio de la variable definida
		model.addAttribute(captureVariableName,dataFont);
		
		// retorna la pagina a mostrar
		return endPointPage;
			
	}
	
}