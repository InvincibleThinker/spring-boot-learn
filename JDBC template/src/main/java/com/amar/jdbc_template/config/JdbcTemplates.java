package com.amar.jdbc_template.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@Configuration
public class JdbcTemplates {


    public JdbcTemplate jdbcTemplates(final DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
