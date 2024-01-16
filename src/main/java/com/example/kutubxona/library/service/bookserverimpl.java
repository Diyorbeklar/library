package com.example.kutubxona.library.service;


import com.example.kutubxona.library.dao.bookimpl;
import com.example.kutubxona.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookserverimpl implements bookserver{
    @Autowired
    bookimpl bookimpl;
    @Override
    public List<Book> getListBook() {
        return bookimpl.getListBook();
    }

    @Override
    public Book getBookById(Integer id) {
        return bookimpl.getBookById(id);
    }

    @Override
    public void updateBook(Integer id, Book book) {
        bookimpl.updateBook(id,book);
    }

    @Override
    public void createBook(Book book) {
        bookimpl.createBook(book);
    }

    @Override
    public void deleteBook(Integer id) {
        bookimpl.deleteBook(id);
    }
}


