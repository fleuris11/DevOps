package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Hello c'est le cours de CI CD";
	}

	public int addition(int premierNombre, int secondNombre) {
		return premierNombre + secondNombre;
	}

	public int soustraction(int premierNombre, int secondNombre) {
		return premierNombre - secondNombre;
	}

	public double division(double dividende, double diviseur) {
		if (diviseur == 0) {
			throw new IllegalArgumentException("Non williaaammmm La division par zero jamais jamais");
		}

		return dividende / diviseur;
	}
}
