package com.amar.jdbc_template;

import com.amar.jdbc_template.domain.Author;

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
}
