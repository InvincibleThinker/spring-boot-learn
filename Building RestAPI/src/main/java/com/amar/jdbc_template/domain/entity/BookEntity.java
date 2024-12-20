package com.amar.jdbc_template.domain.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Builder
@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    private String isbn;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private AuthorEntity authorEntity;

    public BookEntity() {
    }

    public BookEntity(String isbn, String title, AuthorEntity authorEntity) {
        this.isbn = isbn;
        this.title = title;
        this.authorEntity = authorEntity;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorEntity getAuthor() {
        return authorEntity;
    }

    public void setAuthor(AuthorEntity authorEntity) {
        this.authorEntity = authorEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity bookEntity = (BookEntity) o;
        return Objects.equals(isbn, bookEntity.isbn) && Objects.equals(title, bookEntity.title) && Objects.equals(authorEntity, bookEntity.authorEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, authorEntity);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + authorEntity +
                '}';
    }

    public static class BookBuilder{
        private String isbn;
        private String title;
        private AuthorEntity authorEntity;

        public BookBuilder isbn(String isbn){
            this.isbn = isbn;
            return this;
        }

        public BookBuilder title(String title){
            this.title = title;
            return this;
        }

        public BookBuilder authorEntity(AuthorEntity authorEntity){
            this.authorEntity = authorEntity;
            return this;
        }

        public BookEntity build() {
            return new BookEntity( isbn, title, authorEntity);
        }
    }

    public static BookBuilder builder(){
        return  new BookBuilder();
    }
}
