package com.amar.jdbc_template.services.impl;

import com.amar.jdbc_template.domain.entity.AuthorEntity;
import com.amar.jdbc_template.repositories.AuthorRepository;
import com.amar.jdbc_template.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
       return authorRepository.save(authorEntity);

    }
}
