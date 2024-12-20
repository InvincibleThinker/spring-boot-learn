package com.amar.jdbc_template.services;

import com.amar.jdbc_template.domain.entity.BookEntity;

import java.util.List;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);

    List<BookEntity> findAll();
}
