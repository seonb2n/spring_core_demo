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

    @Autowired
//    @Qualifier("yourBookRepository")
    private BookRepository bookRepository;
//    private BookRepository myBookRepository;

    public Book save(Book book) {
        book.setCreated(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return book;
    }
}
