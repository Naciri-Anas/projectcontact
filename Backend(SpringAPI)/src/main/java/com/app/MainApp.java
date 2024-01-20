package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {
	private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
		LOGGER.info("Backend is Running Fine........!");
	}

}
