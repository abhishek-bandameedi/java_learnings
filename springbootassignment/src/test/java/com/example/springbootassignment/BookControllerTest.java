package com.example.springbootassignment;

import com.example.springbootassignment.entity.Book;
import com.example.springbootassignment.rest.BookController;
import com.example.springbootassignment.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;


import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
public class BookControllerTest {
    @Mock
    private BookService bookService;
    @InjectMocks
    private BookController bookController;
    private MockMvc mockMvc;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();
    }

    @Test
    public void testGetBooks() throws Exception {
        List<Book> books = Arrays.asList(
                new Book(null, "To Kill a Mockingbird", "Harper Lee", "9780446310789"));

        when(bookService.getAllBooks()).thenReturn(books);
        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].isbn", is("9780446310789")))
                .andExpect(jsonPath("$[0].title", is("To Kill a Mockingbird")))
                .andExpect(jsonPath("$[0].author", is("Harper Lee")));
        verify(bookService, times(1)).getAllBooks();
    }
    @Test
    public void testCreateUser() throws Exception {
        Book book=new Book(null, "To Kill a Mockingbird", "Harper Lee", "9780446310789");
        mockMvc.perform(post("/api/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(book)))
                .andExpect(status().isOk());
        verify(bookService, times(1)).saveBook(book);
    }
    @Test
    public void testGetUserById() throws Exception {
        Book book=new Book(1L, "To Kill a Mockingbird", "Harper Lee", "9780446310789");
        when(bookService.getBookById(1L)).thenReturn(book);

        mockMvc.perform(get("/api/books/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.title", is("To Kill a Mockingbird")))
                .andExpect(jsonPath("$.author", is("Harper Lee")))
                .andExpect(jsonPath("$.isbn", is("9780446310789")));
    }
    @Test
    public void testUpdateBook() throws Exception {
        // Arrange
        Book book = new Book(1L,"Spring Boot in Action", "Craig Walls", "1234");

        // Act
        mockMvc.perform(put("/api/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(book)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.isbn", is("1234")))
                .andExpect(jsonPath("$.title", is("Spring Boot in Action")))
                .andExpect(jsonPath("$.author", is("Craig Walls")));

        // Assert
        verify(bookService, times(1)).saveBook(book);
    }
    @Test
    public void testDeleteBook() throws Exception {
        // Arrange
        long bookId = 1234L;
        Book book = new Book(1L,"Spring Boot in Action", "Craig Walls", "1234");

        when(bookService.getBookById(bookId)).thenReturn(book);

        // Act
        mockMvc.perform(delete("/api/books/{id}", bookId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.isbn", is("1234")))
                .andExpect(jsonPath("$.title", is("Spring Boot in Action")))
                .andExpect(jsonPath("$.author", is("Craig Walls")));

        // Assert
        verify(bookService, times(1)).getBookById(bookId);
        verify(bookService, times(1)).deleteBook(bookId);
    }
}
