package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Example method to test DI
    public void displayBooks() {
        bookRepository.getAllBooks().forEach(System.out::println);
    }
}
