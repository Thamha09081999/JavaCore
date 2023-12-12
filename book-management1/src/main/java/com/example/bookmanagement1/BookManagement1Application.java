package com.example.bookmanagement1;

import com.example.bookmanagement1.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BookManagement1Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BookManagement1Application.class, args);
		BookService bookService = context.getBean(BookService.class);


	}

}
