package com.amar.jdbc_template.dao;


import com.amar.jdbc_template.TestDataUtil;
import com.amar.jdbc_template.dao.impl.AuthorDAOImpl;
import com.amar.jdbc_template.domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
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
        Author author = TestDataUtil.createTestAuthorA();

        underTest.create(author);

        verify(jdbcTemplate).update(eq("INSERT INTO authors (id,name,age) VALUES(?,?,?)"),
                eq(1L), eq("Jack Rose"), eq(38));
    }

    @Test
    public void testThatFindOneGeneratesTheCorrectSql(){
        underTest.findOne(1L);
        verify(jdbcTemplate).query(
                eq("SELECT id, name, age FORM authors WHERE id = ? LIMIT 1"),
                ArgumentMatchers.<AuthorDAOImpl.AuthorRowMapper>any(),
                eq(1L)
        );
    }

    @Test
    public void testThatFindManyGeneratesCorrectSql(){
        underTest.find();
        verify(jdbcTemplate).query(eq("SELECT id, name, age FROM authors"),
                ArgumentMatchers.<AuthorDAOImpl.AuthorRowMapper>any());
    }
}
