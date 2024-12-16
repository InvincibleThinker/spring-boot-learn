package com.amar.jdbc_template.domain;


import java.util.Objects;


public class Book {

    private String isbn;

    private String title;

    private Long authorId;

    public Book() {
    }

    public Book(String isbn, String title, Long authorId) {
        this.title = title;
        this.isbn = isbn;
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(authorId, book.authorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, authorId);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authorId=" + authorId +
                '}';
    }

    public static class BookBuilder{
        private String isbn;
        private String title;
        private Long authorId;

        public BookBuilder isbn(String isbn){
            this.isbn = isbn;
            return this;
        }

        public BookBuilder title(String title){
            this.title = title;
            return this;
        }

        public BookBuilder authorId(Long authorId){
            this.authorId = authorId;
            return this;
        }

        public Book build() {
            return new Book( isbn, title, authorId);
        }
    }

    public static BookBuilder builder(){
        return  new BookBuilder();
    }
}
