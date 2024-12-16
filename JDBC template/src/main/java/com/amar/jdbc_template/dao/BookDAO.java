package com.amar.jdbc_template.dao;

import com.amar.jdbc_template.domain.Book;

import java.util.Optional;

public interface BookDAO {

    void create(Book book);

    Optional<Book> find(String isbn);
}
