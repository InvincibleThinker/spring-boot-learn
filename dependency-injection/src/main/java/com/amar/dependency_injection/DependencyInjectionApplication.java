package com.amar.dependency_injection;

import com.amar.dependency_injection.services.ColorPrint;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class DependencyInjectionApplication implements CommandLineRunner {
	private static final Logger log = LogManager.getLogger(DependencyInjectionApplication.class);
	private ColorPrint colorPrint;

	public DependencyInjectionApplication(ColorPrint colorPrint){
		this.colorPrint = colorPrint;
	}

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}


	@Override
	public void run(final String... args){
		log.info(colorPrint.print());
	}

}
