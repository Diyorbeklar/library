package com.example.kutubxona.library.dao;

import com.example.kutubxona.library.model.Author;
import java.util.List;
public interface authordao {
    public List<Author> getListAuthor();
    public Author getAuthorById(Integer id);
    void updateAuthor(Integer id, Author author);
    void createAuthor(Author author);
    void deleteAuthor(Integer id);

}
