package com.learning.springbootin10step;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BooksController {
    @GetMapping("books")
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(1, "Master Spring 5.0", "Ranga Karanam"),
                new Book(2, "Code Complete", "Steve Mac"));
    }
}