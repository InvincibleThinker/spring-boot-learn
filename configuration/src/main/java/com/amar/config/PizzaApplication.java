package com.amar.config;

import com.amar.config.config.PizzaConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaApplication implements CommandLineRunner {

	private PizzaConfig pizzaConfig;

	private static final Logger log = LogManager.getLogger(PizzaApplication.class);

    public PizzaApplication(PizzaConfig pizzaConfig) {
        this.pizzaConfig = pizzaConfig;
    }

    public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);
	}

	@Override
	public void run(String... args){


		log.info("I want {} crust pizza, with {} and {}", pizzaConfig.getCrust(), pizzaConfig.getTopping(), pizzaConfig.getSauce());

	}
}
