package com.amar.jdbc_template.dao;


import com.amar.jdbc_template.dao.impl.AuthorDAOImpl;
import com.amar.jdbc_template.domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AuthorDaoImplTests {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    public AuthorDAOImpl underTest;

    @Test
    public void testThatCreateAuthorGenratesCorrectSql(){
        Author author = Author.builder()
                .id(1l)
                .name("Jack Rose")
                .age(38)
                .build();

        underTest.create(author);

        verify(jdbcTemplate).update(eq("INSERT INTO authors (id,name,age) VALUES(?,?,?)"),
                eq(1L), eq("Jack Rose"), eq(38));
    }
}
