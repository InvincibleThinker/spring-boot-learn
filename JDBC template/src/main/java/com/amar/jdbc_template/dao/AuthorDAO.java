package com.amar.jdbc_template.dao;

import com.amar.jdbc_template.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorDAO {
    void create(Author author);

    Optional<Author> findOne(long l);

    List<Author> find();
}
