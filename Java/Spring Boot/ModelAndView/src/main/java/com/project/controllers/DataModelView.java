package com.project.controllers;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.project.bussiness_logic.DataGenerator;

@Controller
@RequestMapping("/model_view")
public class DataModelView {	
	
	// adicionado filtrado por @PathVariable, pero se debe adicionar otro endpoint y meter el parametro entre llaves para que sea el valor a capturar y usado para filtrar
	@GetMapping({"/model_and_view","/model_and_view/{id}"})
	public ModelAndView data_model_view (@RequestParam(defaultValue = "0", name = "id", required = false) String id, 
			@PathVariable(name = "id", required = false) String id_path) {
				
		// captura el valor para el filtrado
		Integer id_filter = StringUtils.isNumeric(id_path) ? Integer.parseInt(id_path) : StringUtils.isNumeric(id) ? Integer.parseInt(id) : 0; 
						
		// define el endpoint de acceso y el nombre de la variable a capturar
		String endPointPage = "/pages/modelandview";
		String captureVariableName = "captureVariableName";
		
		// guarada la lista de objetos creados para enviar a la pagina
		ArrayList<?> dataFont = (ArrayList<?>)  DataGenerator.homeArticles(id_filter);
		//guarda la ruta de la pagina a cargar
		ModelAndView model_view = new ModelAndView(endPointPage);
		//guarda la informaciond e la variable a cargar y los datos enviadops a esta variable
		model_view.addObject(captureVariableName,dataFont);
		
		// retorna los datos a la pagina y el acceso a la pagina
		return model_view;			
	}
}