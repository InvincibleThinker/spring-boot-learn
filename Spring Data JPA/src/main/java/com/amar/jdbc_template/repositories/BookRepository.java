package com.amar.jdbc_template.repositories;

import com.amar.jdbc_template.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {
}
