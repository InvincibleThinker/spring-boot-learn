package com.amar.H2_Database;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@SpringBootApplication
public class H2DatabaseApplication implements CommandLineRunner {
	private static final Logger log = LogManager.getLogger(H2DatabaseApplication.class);
	private final DataSource dataSource;

    public H2DatabaseApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
		SpringApplication.run(H2DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args){
		log.info("Datasource" + dataSource.toString());

		final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
		restTemplate.execute("select 1");

	}
}
