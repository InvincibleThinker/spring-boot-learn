package com.amar.jdbc_template.dao.impl;

import com.amar.jdbc_template.dao.BookDAO;
import com.amar.jdbc_template.domain.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Book> find(String isbn) {
       List<Book> result = jdbcTemplate.query(
                "SELET isbn, title, authorId FROM books WHERE isbn = ? LIMIT 1",
                new BookRowMapper(),
                isbn
        );

       return result.stream().findFirst();
    }

    public static class BookRowMapper implements RowMapper<Book>{

        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
          return   Book.builder()
                    .isbn(rs.getString("isbn"))
                    .title(rs.getString("title"))
                    .authorId(rs.getLong("authorId"))
                    .build();
        }
    }
}
