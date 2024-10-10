package com.kk.e_Library.service;

import com.kk.e_Library.entity.Book;

import java.util.List;
import java.util.UUID;

public interface BookService {

    Book addBook(Book book);
    List<Book> getAllBooks();
    UUID getBookById(UUID bookId);
}
