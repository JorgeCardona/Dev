package com.project.bussiness_logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.project.classes.HomeArticles;
import com.project.classes.ProgrammingLanguages;

public class DataGenerator{
	
	
	public static List<?> dataLanguages() {
		
		
		ArrayList<ProgrammingLanguages> languages = new ArrayList<>();
		
		Random ram = new Random();
		
		for (int i = 1;i<=10;i++) {			
			

			languages.add(new ProgrammingLanguages (i,String.valueOf(i*i),ram.nextDouble(), ram.nextInt(), new Date()));
			
		}
		
		return languages;
				
	}
	
	public static List<?> homeArticles(){
		
		
		ArrayList<HomeArticles> articles = new ArrayList<>();
		
		Random ram = new Random();
		
		for (int j = 1; j<=10;j++) {
			
			articles.add(new HomeArticles(j, String.valueOf(j*5), ram.nextInt(), ram.nextDouble(), new Date()));
		}
		
		
		return articles;
		
		
	}
	
}