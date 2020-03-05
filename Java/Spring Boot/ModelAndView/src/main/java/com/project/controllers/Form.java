<<<<<<< HEAD
package com.project.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.bussiness_logic.DataGenerator;
import com.project.classes.HomeArticles;
import com.project.classes.MenuCarta;
import com.project.classes.ProgrammingLanguages;

@Controller
public class Form {

	// endpoint donde se captura la informacion del formulario
	@GetMapping("/form_data")
	public String form_data (Model model) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/form";
		String captureVariableName = "captureVariableName";	
		
		// se instancia la clase que se va a guardar la informacion
		MenuCarta classInstance = new MenuCarta();
		
		// define el nombre de la variable que va a ser capturada en la pagina
		// se envia los datos que se van a leer por intermedio de la variable definida
		model.addAttribute(captureVariableName, classInstance);
		
		// retorna la pagina a mostrar
		return endPointPage;}
	
	// endpoint donde se muestra la informacion con el metodo post
	// regularmente se nombra el endpoint del post igual que el del get, si en este del post hay un enlace hacia el metodo get
	//  de lo contrario es necesario tener 2 nombres de endpoint distintos
	@PostMapping("/form_data")
	public String add_data_form (MenuCarta captureVariableName) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/form_add";
		
		// retorna la pagina como la informacion capturada por el formulario usando el metodo post
		return endPointPage;}
	
	
	// endpoint donde se captura la informacion del formulario
	@GetMapping("/form")
	public String form (Model model) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/form";
		String captureVariableName = "captureVariableName";	
		
		// se instancia la clase que se va a guardar la informacion
		HomeArticles classInstance = new HomeArticles();
		
		// define el nombre de la variable que va a ser capturada en la pagina
		// se envia los datos que se van a leer por intermedio de la variable definida
		model.addAttribute(captureVariableName, classInstance);
		
		// retorna la pagina a mostrar
		return endPointPage;}
	
	// endpoint donde se muestra la informacion con el metodo post
	// regularmente se nombra el endpoint del post igual que el del get, si en este del post hay un enlace hacia el metodo get
	//  de lo contrario es necesario tener 2 nombres de endpoint distintos
	@PostMapping("/form")
	public String add_data(HomeArticles captureVariableName) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/form_add";
		
		// retorna la pagina como la informacion capturada por el formulario usando el metodo post
		return endPointPage;}
	
=======
package com.project.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.bussiness_logic.DataGenerator;
import com.project.classes.HomeArticles;
import com.project.classes.MenuCarta;
import com.project.classes.ProgrammingLanguages;

@Controller
public class Form {

	// endpoint donde se captura la informacion del formulario
	@GetMapping("/form_data")
	public String form_data (Model model) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/form";
		String captureVariableName = "captureVariableName";	
		
		// se instancia la clase que se va a guardar la informacion
		MenuCarta classInstance = new MenuCarta();
		
		// define el nombre de la variable que va a ser capturada en la pagina
		// se envia los datos que se van a leer por intermedio de la variable definida
		model.addAttribute(captureVariableName, classInstance);
		
		// retorna la pagina a mostrar
		return endPointPage;}
	
	// endpoint donde se muestra la informacion con el metodo post
	// regularmente se nombra el endpoint del post igual que el del get, si en este del post hay un enlace hacia el metodo get
	//  de lo contrario es necesario tener 2 nombres de endpoint distintos
	@PostMapping("/form_data")
	public String add_data_form (MenuCarta captureVariableName) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/form_add";
		
		// retorna la pagina como la informacion capturada por el formulario usando el metodo post
		return endPointPage;}
	
	
	// endpoint donde se captura la informacion del formulario
	@GetMapping("/form")
	public String form (Model model) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/form";
		String captureVariableName = "captureVariableName";	
		
		// se instancia la clase que se va a guardar la informacion
		HomeArticles classInstance = new HomeArticles();
		
		// define el nombre de la variable que va a ser capturada en la pagina
		// se envia los datos que se van a leer por intermedio de la variable definida
		model.addAttribute(captureVariableName, classInstance);
		
		// retorna la pagina a mostrar
		return endPointPage;}
	
	// endpoint donde se muestra la informacion con el metodo post
	// regularmente se nombra el endpoint del post igual que el del get, si en este del post hay un enlace hacia el metodo get
	//  de lo contrario es necesario tener 2 nombres de endpoint distintos
	@PostMapping("/form")
	public String add_data(HomeArticles captureVariableName) {
		
		// directorio donde esta la pagina a mostrar
		String endPointPage = "/pages/form_add";
		
		// retorna la pagina como la informacion capturada por el formulario usando el metodo post
		return endPointPage;}
	
>>>>>>> dd1f099e8009aeb4b355b7e2df75a1584fa28b51
}