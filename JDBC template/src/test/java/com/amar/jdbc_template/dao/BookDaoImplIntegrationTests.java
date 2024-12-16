package com.amar.jdbc_template.dao;

import com.amar.jdbc_template.TestDataUtil;
import com.amar.jdbc_template.dao.impl.BookDAOIml;
import com.amar.jdbc_template.domain.Author;
import com.amar.jdbc_template.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BookDaoImplIntegrationTests {

    private AuthorDAO authorDAO;

    private BookDAOIml underTest;

    @Autowired
    public BookDaoImplIntegrationTests(BookDAOIml underTest, AuthorDAO authorDAO){
        this.underTest = underTest;
        this.authorDAO = authorDAO;
    }

    @Test
    public void testThatBookCanBeCreatedAndRecalled(){
        Author author = TestDataUtil.createTestAuthor();
        authorDAO.create(author);
        Book book = TestDataUtil.creatBookTest();
        book.setAuthorId(author.getId());
        underTest.create(book);
        Optional<Book> result = underTest.find(book.getIsbn());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(book);
    }
}
