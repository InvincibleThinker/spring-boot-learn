package com.amar.jdbc_template.domain;




import jakarta.persistence.*;
import lombok.Builder;

import java.util.Objects;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    private Long id;

    private String name;

    private Integer age;

    public Author() {
    }

    public Author( Long id,String name, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) && Objects.equals(name, author.name) && Objects.equals(age, author.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class AuthorBuilder {
        private Long id;
        private String name;
        private Integer age;

        // Set the id
        public AuthorBuilder id(Long id) {
            this.id = id;
            return this;
        }

        // Set the name
        public AuthorBuilder name(String name) {
            this.name = name;
            return this;
        }

        // Set the age
        public AuthorBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        // Build the Author object
        public Author build() {
            return new Author(id, name, age);
        }
    }

    // Static method to get the builder
    public static AuthorBuilder builder() {
        return new AuthorBuilder();
    }
}
