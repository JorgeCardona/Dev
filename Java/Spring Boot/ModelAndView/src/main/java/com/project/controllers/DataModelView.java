package com.project.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.bussiness_logic.DataGenerator;

@Controller
@RequestMapping("/model_view")
public class DataModelView {	
	
	@GetMapping("/model_and_view")
	public ModelAndView data_model_view (@RequestParam(defaultValue = "0", name = "id", required = false) int id ) {
		
		// define el endpoint de acceso y el nombre de la variable a capturar
		String endPointPage = "/pages/modelandview";
		String captureVariableName = "captureVariableName";
		
		// guarada la lista de objetos creados para enviar a la pagina
		ArrayList<?> dataFont = (ArrayList<?>)  DataGenerator.homeArticles(id);
		//guarda la ruta de la pagina a cargar
		ModelAndView model_view = new ModelAndView(endPointPage);
		//guarda la informaciond e la variable a cargar y los datos enviadops a esta variable
		model_view.addObject(captureVariableName,dataFont);
		
		// retorna los datos a la pagina y el acceso a la pagina
		return model_view;
			
	}

}