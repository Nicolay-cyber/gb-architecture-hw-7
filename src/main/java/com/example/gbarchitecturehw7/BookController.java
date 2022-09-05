package com.example.gbarchitecturehw7;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;

@Controller
@AllArgsConstructor
public class BookController {
    BookService bookService;

    @GetMapping("/books")
    public String findAllBooks(){
        return bookService.findAllBook();
    }
    @GetMapping("/{id}")
    public String findById(@PathVariable Long id){
        return bookService.findById(id);
    }
    @PostConstruct()
    public String saveNewBook(@PathVariable String title, @PathVariable String author){
        bookService.saveNewBook(title,author);
        return findAllBooks();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBookById(@PathVariable Long id){
        bookService.deleteBookById(id);
        return findAllBooks();
    }
}
