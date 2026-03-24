package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class HelloControllerTest {

	private final HelloController controller = new HelloController();

	@Test
	void testHelloController() {
		assertEquals("Hello c'est le cours de CI CD", controller.hello());
	}

	@Test
	void testAddition() {
		assertEquals(8, controller.addition(5, 3));
	}

	@Test
	void testSoustraction() {
		assertEquals(2, controller.soustraction(5, 3));
	}

	@Test
	void testDivision() {
		assertEquals(2.0, controller.division(6, 3));
	}

	@Test
	void testDivisionParZero() {
		assertThrows(IllegalArgumentException.class, () -> controller.division(6, 0));
	}
}
