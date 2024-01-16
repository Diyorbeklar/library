package com.example.kutubxona.library.controller;

import com.example.kutubxona.library.model.Book;
import com.example.kutubxona.library.service.bookserverimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class bookcontroller {
    @Autowired
    bookserverimpl bookserverimpl;
    @GetMapping
    public List<Book> getbooks(){
        return bookserverimpl.getListBook();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Integer id){
        return bookserverimpl.getBookById(id);
    }
    @PostMapping()
    public void insertBook(@RequestBody Book book){
        bookserverimpl.createBook(book);
    }
    @DeleteMapping()
    public void deleteBook(@RequestBody Book book){

        bookserverimpl.deleteBook(book.getId());
    }
    @PutMapping("/{id}")
    public void updateBook(@PathVariable("id") Integer id,@RequestBody Book book){
        bookserverimpl.updateBook(id,book);
    }

}


