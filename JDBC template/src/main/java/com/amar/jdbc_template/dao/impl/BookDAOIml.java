package com.amar.jdbc_template.dao.impl;

import com.amar.jdbc_template.dao.BookDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAOIml implements BookDAO {

    private final JdbcTemplate jdbcTemplate;

    public BookDAOIml(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
