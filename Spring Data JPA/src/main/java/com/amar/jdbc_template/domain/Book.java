package com.amar.jdbc_template.domain;


import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Builder
@Entity
@Table(name = "books")
public class Book {

    @Id
    private String isbn;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Author author;

    public Book() {
    }

    public Book(String isbn, String title, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }

    public static class BookBuilder{
        private String isbn;
        private String title;
        private Author author;

        public BookBuilder isbn(String isbn){
            this.isbn = isbn;
            return this;
        }

        public BookBuilder title(String title){
            this.title = title;
            return this;
        }

        public BookBuilder author(Author author){
            this.author = author;
            return this;
        }

        public Book build() {
            return new Book( isbn, title, author);
        }
    }

    public static BookBuilder builder(){
        return  new BookBuilder();
    }
}
