package com.amar.jdbc_template.services;

import com.amar.jdbc_template.domain.entity.BookEntity;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);
}
