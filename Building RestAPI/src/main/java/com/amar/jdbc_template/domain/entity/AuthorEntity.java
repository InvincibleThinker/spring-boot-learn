package com.amar.jdbc_template.domain.entity;




import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Builder
@Entity
@Table(name = "authors")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    private Long id;

    private String name;

    private Integer age;

    public AuthorEntity() {
    }

    public AuthorEntity(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
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
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AuthorEntity authorEntity = (AuthorEntity) o;
        return Objects.equals(id, authorEntity.id) && Objects.equals(name, authorEntity.name) && Objects.equals(age, authorEntity.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
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
        public AuthorEntity build() {
            return new AuthorEntity(id, name, age);
        }
    }

    // Static method to get the builder
    public static AuthorBuilder builder() {
        return new AuthorBuilder();
    }


}
