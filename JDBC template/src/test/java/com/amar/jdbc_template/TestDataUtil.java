package com.amar.jdbc_template;

import com.amar.jdbc_template.domain.Author;
import com.amar.jdbc_template.domain.Book;

public final class TestDataUtil {
    private TestDataUtil(){

    }

    public static Author createTestAuthor() {
        return Author.builder()
                .id(1l)
                .name("Jack Rose")
                .age(38)
                .build();
    }

    public static Book creatBookTest() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }
}
