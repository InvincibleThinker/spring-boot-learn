package com.amar.jdbc_template.services;

import com.amar.jdbc_template.domain.entity.AuthorEntity;

import java.util.List;

public interface AuthorService {

    AuthorEntity createAuthor(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();
}
