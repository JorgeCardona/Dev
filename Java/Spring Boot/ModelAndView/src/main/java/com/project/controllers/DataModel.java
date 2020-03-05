package com.project.controllers;

import java.util.ArrayList;
// libreria de la dependencia "commons-lang3" para validar tipo de dato como por ejemplo númerico
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.project.bussiness_logic.DataGenerator;


@Controller
@RequestMapping("/data")
public class DataModel {
	
	@GetMapping({"/model","/model/{id}"})
	public String modelo(Model model, @RequestParam (defaultValue = "0", name = "id", required = false) String id,		
			@PathVariable(name = "id", required=false) String idx) {
				
		//Asigna el valor del id segun se envie por parametro o por path
		Integer id_filter = StringUtils.isNumeric(idx)  ? Integer.parseInt(idx) :StringUtils.isNumeric(id) ? Integer.parseInt(id) : 0;
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/model";
		String captureVariableName = "captureVariableName";
		
		// obtiene la lista en al variable usando la funcion de la clase
		ArrayList<?> dataFont = (ArrayList<?>) DataGenerator.dataLanguages(id_filter);
		
		// define el nombre de la variable que va a ser capturada en la pagina
		// se envia los datos que se van a leer por intermedio de la variable definida
		model.addAttribute(captureVariableName,dataFont);
		
		// retorna la pagina a mostrar
		return endPointPage;
	}	
	
	// en el @RequestParam el parametro name = "xyz", el nombre xyz es la variable a la que se le asigna valor en el navegador pára que filtre
	// despues del @RequestParam se debe indicar el tipo de dato y luego el nombre de la variable que se le va a pasar a la funcion.
	// adicionado filtrado por @PathVariable, pero se debe adicionar otro endpoint y meter el parametro entre llaves para que sea el valor a capturar y usado para filtrar
	// adicionado filtrado por @PathVariable, para realizar filtrado por url asi localhost:8080/data/menu/true
	@GetMapping({"/menu","/menu/{vegetarian}"})
	public String list(Model model,  @RequestParam (defaultValue = "false" , name = "vegetarian", required = false)  String vegetarian,
			@PathVariable(name = "vegetarian", required=false) String vegetarian_path) {
				
		// obtiene el valor de true o false, validando si se envio un valor booleano en las url o paths, en caso de no encontrar valor asigna false.
		Boolean vegetarian_data = Boolean.valueOf(vegetarian_path) ? Boolean.parseBoolean(vegetarian_path) : Boolean.valueOf(vegetarian) ? Boolean.parseBoolean(vegetarian) : false;
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/menu";
		String captureVariableName = "captureVariableName";
				
		// obtiene la lista en al variable usando la funcion de la clase
		ArrayList<?> dataFont = (ArrayList<?>) DataGenerator.menutypes(vegetarian_data);
		
		// define el nombre de la variable que va a ser capturada en la pagina
		// se envia los datos que se van a leer por intermedio de la variable definida
		model.addAttribute(captureVariableName,dataFont);
		
		// retorna la pagina a mostrar
		return endPointPage;			
	}	
}