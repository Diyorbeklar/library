package com.example.kutubxona.library.service;

import com.example.kutubxona.library.model.Book;

import java.util.List;

public interface bookserver {
    public List<Book> getListBook();
    public Book getBookById(Integer id);
    void updateBook(Integer id, Book book);
    void createBook(Book book);
    void deleteBook(Integer id);
}
