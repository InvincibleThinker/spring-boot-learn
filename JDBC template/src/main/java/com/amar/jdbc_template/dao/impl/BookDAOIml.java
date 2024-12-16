package com.amar.jdbc_template.dao.impl;

import com.amar.jdbc_template.dao.BookDAO;
import com.amar.jdbc_template.domain.Book;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAOIml implements BookDAO {

    private final JdbcTemplate jdbcTemplate;

    public BookDAOIml(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create(Book book) {
        jdbcTemplate.update(
                "INSERT INTO books (isbn, title, author_id) VALUES (?, ?, ?)",
                book.getIsbn(),
                book.getTitle(),
                book.getAuthorId()
        );
    }
}
