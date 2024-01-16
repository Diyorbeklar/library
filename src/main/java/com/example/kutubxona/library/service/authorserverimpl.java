package com.example.kutubxona.library.service;

import com.example.kutubxona.library.dao.authorimpl;
import com.example.kutubxona.library.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class authorserverimpl implements authorserver{
    @Autowired
    authorimpl authorimpl;
    @Override
    public List<Author> getListAuthor() {
        return authorimpl.getListAuthor();
    }

    @Override
    public Author getAuthorById(Integer id) {
        return authorimpl.getAuthorById(id);
    }

    @Override
    public void updateAuthor(Integer id, Author author) {
        authorimpl.updateAuthor(id,author);
    }

    @Override
    public void createAuthor(Author author) {
        authorimpl.createAuthor(author);
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorimpl.deleteAuthor(id);
    }
}

