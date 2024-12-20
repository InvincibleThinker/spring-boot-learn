package com.amar.jdbc_template.domain.dto;

import java.util.Objects;

public class BookDto {

    private String isbn;

    private String title;

    private AuthorDto author;

    public BookDto() {
    }

    public BookDto(String isbn, String title, AuthorDto author) {
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

    public AuthorDto getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDto author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(isbn, bookDto.isbn) && Objects.equals(title, bookDto.title) && Objects.equals(author, bookDto.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author);
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }

    public static class BookDtoBuilder{
        private String isbn;
        private String title;
        private AuthorDto author;

        public BookDto.BookDtoBuilder isbn(String isbn){
             this.isbn = isbn;
             return this;
        }

        public BookDto.BookDtoBuilder title(String title){
            this.title = title;
            return this;
        }

        public BookDto.BookDtoBuilder author(AuthorDto author){
            this.author = author;
            return this;
        }

        public BookDto build(){
            return new BookDto(isbn, title, author);
        }
    }

    public static BookDto.BookDtoBuilder builder(){
        return new BookDto.BookDtoBuilder();
    }
}
