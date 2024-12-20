package com.amar.jdbc_template.repositories;

import com.amar.jdbc_template.domain.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, String> {
}
