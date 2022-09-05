package com.example.gbarchitecturehw7;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    @PostConstruct
    public void init() {
        books.add(new Book(1L, "John", "My Life"));
        books.add(new Book(2L, "Nick", "His Life"));
        books.add(new Book(3L, "Someone", "Other Life"));
    }

    public List<Book> findAllBook() {
        return books;
    }

    public Book findById(Long id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElseThrow(NullPointerException::new);
    }

    public void saveNewBook(String title, String author) {
        books.add(new Book((long) (books.size() + 1), title, author));
    }

    public void deleteBookById(Long id) {
        books.remove(findById(id));
    }
}
