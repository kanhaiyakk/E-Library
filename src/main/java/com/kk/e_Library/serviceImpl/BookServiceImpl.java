package com.kk.e_Library.serviceImpl;

import com.kk.e_Library.entity.Book;
import com.kk.e_Library.repository.BookRepository;
import com.kk.e_Library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book addBook(Book book) {
        return (Book) bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public UUID getBookById(UUID bookId) {
        Optional<Book> bookOptional = bookRepository.findById(bookId);
        return bookOptional.orElse(null).getId();
    }
}
