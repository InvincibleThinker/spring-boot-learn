package com.amar.jdbc_template.dao.impl;

import com.amar.jdbc_template.dao.AuthorDAO;
import com.amar.jdbc_template.domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDAOImpl implements AuthorDAO {

    private final JdbcTemplate jdbcTemplate;

    public AuthorDAOImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {

        jdbcTemplate.update(
                "INSERT INTO authors(id, name, age) VALUES(?,?,?)",
                author.getId(),
                author.getName(),
                author.getAge()
        );
    }
}
