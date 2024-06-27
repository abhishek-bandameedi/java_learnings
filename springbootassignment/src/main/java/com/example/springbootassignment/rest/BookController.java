package com.example.springbootassignment.rest;
import java.util.List;
import com.example.springbootassignment.entity.Book;
import com.example.springbootassignment.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    public Book getbook(@PathVariable long id) {
        return bookService.getBookById(id);
    }
    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book){
        bookService.saveBook(book);
        return book;
    }
    @DeleteMapping("/books/{id}")
    public Book deleteCustomers(@PathVariable long id){
        Book book=bookService.getBookById(id);
        bookService.deleteBook(id);
        return book;
    }
    @PostMapping("/books")
    public Book saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return book;
    }
}


