package com.amar.Json.Jackson.controller;

import com.amar.Json.Jackson.domain.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping(path = "/books")
    public Book retrieveBook(){
        return Book.builder()
                .isbn("978-0-13-478627-5")
                .title("The Enigma of Eternity")
                .author("Aria Montgomery")
                .yearPublished("2005")
                .build();
    }

    @PostMapping(path = "/books")
    public Book creteBook(@RequestBody final Book book){
        log.info("Got book:" + book.toString());
        return book;
    }

}
