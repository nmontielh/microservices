package org.microservices.app.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase controladora que va a tener acceso a servicios publicados via rest
 * 
 * @author montieln
 *
 */
@RestController
public class HelloController {

	private int contador;

	@RequestMapping("/index")
	public String index() {

		System.out.println("Invocando " + contador++);

		return "Greetings from Spring Boot!";
	}

}