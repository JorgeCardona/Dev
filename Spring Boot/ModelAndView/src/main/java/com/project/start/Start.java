package com.project.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// se declarara esta anotacion para que acceda a los archivos de estos paquetes especificos
// @ComponentScan({"com.project.controllers","com.project.model"})
// tambien se puede realizando el nombre de parte del paquete y coge todos los directorios
// que esten dentro de ese paquete, como por ejemplo 
// @ComponentScan("com.project")
@ComponentScan({"com.project.controllers"})
@SpringBootApplication
public class Start {

	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);
	}
}
