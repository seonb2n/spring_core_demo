package com.example.inflearn_spring_core_demo.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MyBookRepository implements BookRepository {
}
