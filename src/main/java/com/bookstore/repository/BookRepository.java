package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.model.Book;

import java.util.List;


public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByCategory(String category);

    List<Book> findByTitleContaining(String title);
}
