package com.amar.PsSql;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication

public class PsSqlApplication implements CommandLineRunner {

	private static final Logger log = LogManager.getLogger(PsSqlApplication.class);
	private final DataSource dataSource;

    public PsSqlApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
		SpringApplication.run(PsSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Datasource: " + dataSource.toString());
		final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);

		restTemplate.execute("select 1");
	}
}
