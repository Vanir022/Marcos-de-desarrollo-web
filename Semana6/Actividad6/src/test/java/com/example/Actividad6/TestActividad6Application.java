package com.example.Actividad6;

import org.springframework.boot.SpringApplication;

public class TestActividad6Application {

	public static void main(String[] args) {
		SpringApplication.from(Actividad6Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
