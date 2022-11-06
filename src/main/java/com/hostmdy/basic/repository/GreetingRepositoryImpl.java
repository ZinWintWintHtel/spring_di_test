package com.hostmdy.basic.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository{

	@Override
	public String getEnglishGreeting() {
		// TODO Auto-generated method stub
		return "Hello Primary Greeting Service";
	}

	@Override
	public String getFranceGreeting() {
		// TODO Auto-generated method stub
		return "Bonjour Salutation primaire";
	}

	@Override
	public String getSpanishGreeting() {
		// TODO Auto-generated method stub
		return "Hola saludo de primaria";
	}

}
