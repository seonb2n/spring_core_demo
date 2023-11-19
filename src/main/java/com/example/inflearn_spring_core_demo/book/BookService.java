package com.example.inflearn_spring_core_demo.book;

import java.util.Date;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BookService -> BookRepository
 */
@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        book.setCreated(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("=========================");
        System.out.println("Hello");
    }
}
