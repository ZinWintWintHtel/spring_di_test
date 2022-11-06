package com.hostmdy.basic.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.service.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
	
	private ConstructorInjectedController constructorController;

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpl greetingService = new GreetingServiceImpl();
		constructorController = new ConstructorInjectedController(greetingService);
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpl.HELLO_WORD,constructorController.sayHello());
	}

}
