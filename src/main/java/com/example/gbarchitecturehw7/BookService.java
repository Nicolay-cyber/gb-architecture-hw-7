package com.example.gbarchitecturehw7;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public String findAllBook(){
        StringBuilder bookList = new StringBuilder();
        bookRepository.findAllBook().forEach(book -> bookList.append(book).append("/n"));
        return bookList.toString();
    }

    public String findById(Long id) {
        return bookRepository.findById(id).toString();
    }

    public void saveNewBook(String title, String author) {
        bookRepository.saveNewBook(title,author);
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteBookById(id);
    }
}
