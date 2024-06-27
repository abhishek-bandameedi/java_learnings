package com.example.springbootassignment.service;

import java.util.List;

import com.example.springbootassignment.entity.Book;

public interface BookService {

    public List<Book> getAllBooks();

    public Book getBookById(Long id);

    public void saveBook(Book book);

    public void deleteBook(Long id);
    
    List<Book> searchBooks(String searchTerm);
}
