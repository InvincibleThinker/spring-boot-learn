package com.amar.jdbc_template.domain.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class AuthorDto {

    private Long id;

    private String name;

    private Integer age;

    public AuthorDto() {
    }

    public AuthorDto(Long id, String name, Integer age) {
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
        AuthorDto authorDto = (AuthorDto) o;
        return Objects.equals(id, authorDto.id) && Objects.equals(name, authorDto.name) && Objects.equals(age, authorDto.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public static class AuthorDtoBuilder {
        private Long id;
        private String name;
        private Integer age;

        // Set the id
        public AuthorDto.AuthorDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        // Set the name
        public AuthorDto.AuthorDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        // Set the age
        public AuthorDto.AuthorDtoBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        // Build the Author object
        public AuthorDto build() {
            return new AuthorDto(id, name, age);
        }
    }

    // Static method to get the builder
    public static AuthorDto.AuthorDtoBuilder builder() {
        return new AuthorDto.AuthorDtoBuilder();
    }
}
