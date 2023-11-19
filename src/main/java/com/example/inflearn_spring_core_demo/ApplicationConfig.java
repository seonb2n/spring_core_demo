package com.example.inflearn_spring_core_demo;

import com.example.inflearn_spring_core_demo.book.BookRepository;
import com.example.inflearn_spring_core_demo.book.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = InflearnSpringCoreDemoApplication.class)
public class ApplicationConfig {


    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }
    @Bean
    public BookService bookService() {
        BookService bookService = new BookService(bookRepository());
        return bookService;

    }

}
