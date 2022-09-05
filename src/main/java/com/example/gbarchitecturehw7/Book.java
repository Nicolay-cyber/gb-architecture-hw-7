package com.example.gbarchitecturehw7;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String author;
    private String title;

    public Book(){}


    public Book(Long id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book \"" + title + " written by " + author;
    }
}
