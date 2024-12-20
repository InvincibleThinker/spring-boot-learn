package com.amar.jdbc_template.services.impl;

import com.amar.jdbc_template.domain.entity.BookEntity;
import com.amar.jdbc_template.repositories.BookRepository;
import com.amar.jdbc_template.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(String isbn, BookEntity book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }
}