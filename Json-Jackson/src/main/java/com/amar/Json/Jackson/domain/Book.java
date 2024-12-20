package com.amar.Json.Jackson.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    private String isbn;

    private String title;

    private String author;

    @JsonProperty("year")
    private String yearPublished;

    public Book() {
    }

    public Book(String isbn, String title, String author, String yearPublished) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(yearPublished, book.yearPublished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, yearPublished);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished='" + yearPublished + '\'' +
                '}';
    }

    public static class BookBuilder{
        private String isbn;
        private String title;
        private String author;
        private String yearPublished;

        public BookBuilder isbn(String isbn){
            this.isbn = isbn;
            return this;
        }

        public BookBuilder title(String title){
            this.title = title;
            return this;
        }

        public BookBuilder author(String author){
            this.author = author;
            return this;
        }

        public BookBuilder yearPublished(String yearPublished){
            this.yearPublished = yearPublished;
            return this;
        }

        public Book build() {
            return new Book( isbn, title, author, yearPublished);
        }
    }

    public static BookBuilder builder(){
        return  new BookBuilder();
    }
}
