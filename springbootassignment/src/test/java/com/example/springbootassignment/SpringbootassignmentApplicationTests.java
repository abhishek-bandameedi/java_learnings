package com.example.springbootassignment;

import com.example.springbootassignment.dao.BookRepository;
import com.example.springbootassignment.rest.BookController;
import com.example.springbootassignment.entity.Book;
import com.example.springbootassignment.service.BookServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootassignmentApplicationTests {
	@Mock
	BookRepository bookRepository;
	@InjectMocks
	BookServiceImpl bookService;
	@InjectMocks
	private BookController bookController;
	private MockMvc mockMvc;
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();
	}
	@Test
	public void getAllBooks_ReturnBookList(){
		List<Book> books = Arrays.asList(
				new Book(1L, "To Kill a Mockingbird", "Harper Lee", "9780446310789"),
				new Book(2L, "1984", "George Orwell", "9780451524935")
		);
		when(bookRepository.findAll()).thenReturn(books);
		List<Book> result=bookService.getAllBooks();
		assertEquals(result,books);
	}

	@Test
	public void getBookById_BookWithId(){
		long id=1L;
		Book book=new Book(id, "To Kill a Mockingbird", "Harper Lee", "9780446310789");
		when(bookRepository.findById(id)).thenReturn(Optional.of(book));
		Book result=bookService.getBookById(id);
		assertEquals(result,book);
	}
	@Test
	public void getBookById_NotFound(){
		long id=1L;
		when(bookRepository.findById(id)).thenReturn(Optional.empty());
		Book result=bookService.getBookById(id);
		assertEquals(result,null);
	}

	@Test
	public void saveBook_verify(){
		long id=1L;
		Book book=new Book(id, "To Kill a Mockingbird", "Harper Lee", "9780446310789");
		bookService.saveBook(book);
		verify(bookRepository).save(book);
	}
	@Test
	public void deleteBook_verify(){
		long id=1L;
		bookService.deleteBook(id);
		verify(bookRepository).deleteById(id);
	}
}
