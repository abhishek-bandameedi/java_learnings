package com.example.springbootassignment.service;

import java.util.List;

import com.example.springbootassignment.dao.BookRepository;
import com.example.springbootassignment.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    //@Transactional(readOnly = true)
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    //@Transactional(readOnly = true)
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }



    @Override
    //@Transactional
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    //@Transactional
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    //@Transactional(readOnly = true)
    public List<Book> searchBooks(String searchTerm) {
        return bookRepository.findByTitleContainingIgnoreCase(searchTerm);
    }
}
