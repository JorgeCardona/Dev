package com.project.bussiness_logic;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import com.project.classes.HomeArticles;
import com.project.classes.MenuCarta;
import com.project.classes.ProgrammingLanguages;

public class DataGenerator{
	
	static int max_value = 100;

	public static List<?> menutypes (Boolean vegetarian) {

		ArrayList<MenuCarta> menucarta = new ArrayList<>();
		
		
		Random ram = new Random();
		
		for (int i = 1;i<=10;i++) {			
			
			int limit = MenuCarta.Type.values().length;

			menucarta.add(new MenuCarta (String.valueOf(i), ram.nextBoolean(), i*ram.nextInt(max_value) , MenuCarta.Type.values()[ram.nextInt(limit)]));
		}
				
		if(vegetarian) {
			
			menucarta = (ArrayList<MenuCarta>) menucarta.stream().filter(v -> v.getVegetarian() == true).collect(Collectors.toList());
		}else {
			
			menucarta = menucarta;
		}
		
		return menucarta;
		
	}
	
	public static List<?> dataLanguages(int id) {
		
		
		ArrayList<ProgrammingLanguages> languages = new ArrayList<>();
		
		Random ram = new Random();
		
		for (int i = 1;i<=10;i++) {				
			
			DecimalFormat df = new DecimalFormat("0.00");
			Double number_double = Double.valueOf(df.format(ram.nextDouble()));
			
			
			languages.add(new ProgrammingLanguages ( i,String.valueOf( i*ram.nextInt(max_value)),number_double,  ram.nextInt(max_value), new Date()));
			
		}
		
		if(id < 1) {
			languages = languages;
		}else {
			languages = (ArrayList<ProgrammingLanguages>) languages.stream().filter(d -> d.getId() == id).collect(Collectors.toList());
		}
		
		return languages;
				
	}
	
	public static List<?> homeArticles(int id){
		
		
		ArrayList<HomeArticles> articles = new ArrayList<>();
				
		
		Random ram = new Random();
		
		
		for (int j = 1; j<=10;j++) {
			
			// genera un string formato con decimales deseados
			DecimalFormat df = new DecimalFormat("0.00");
			// convierte el string a double
			Double number_double = Double.valueOf(df.format(ram.nextDouble()));
			
			articles.add(new HomeArticles(j, String.valueOf(j*ram.nextInt(max_value)*5),  Math.round(ram.nextInt(max_value)), number_double , new Date()));
		}
				
		if(id < 1) {
			articles = articles;
		}else {
			articles = (ArrayList<HomeArticles>) articles.stream().filter(d -> d.getId() == id).collect(Collectors.toList());
		}
		
		return articles;
				
	}
	
}