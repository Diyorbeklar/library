package com.example.kutubxona.library.controller;

import com.example.kutubxona.library.model.Author;
import com.example.kutubxona.library.service.authorserverimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class authorcontroller {
    @Autowired
    authorserverimpl authorserverimpl;
    @GetMapping
    public List<Author> getauthors(){
        return authorserverimpl.getListAuthor();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable("id") Integer id){
        return authorserverimpl.getAuthorById(id);
    }
    @PostMapping()
    public void insertAuthor(@RequestBody Author author){
        authorserverimpl.createAuthor(author);
    }
    @DeleteMapping()
    public void deleteAuthor(@RequestBody Author author){

        authorserverimpl.deleteAuthor(author.getId());
    }
    @PutMapping("/{id}")
    public void updateAuthor(@PathVariable("id") Integer id,@RequestBody Author author){
        authorserverimpl.updateAuthor(id,author);
    }

}

