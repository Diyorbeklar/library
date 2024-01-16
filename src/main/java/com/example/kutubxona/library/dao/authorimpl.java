package com.example.kutubxona.library.dao;

import com.example.kutubxona.library.mapper.authormapper;
import com.example.kutubxona.library.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class authorimpl implements authordao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Author> getListAuthor() {
        return (List<Author>) jdbcTemplate.query("SELECT * FROM AUTHOR",new authormapper());
    }

    @Override
    public Author getAuthorById(Integer id) {
        return (Author) jdbcTemplate.queryForObject("SELECT * FROM AUTHOR WHERE ID=?",new Object[]{id},new authormapper());
    }

    @Override
    public void updateAuthor(Integer id, Author author) {
        jdbcTemplate.update("UPDATE AUTHOR SET first_name=?,last_name=?,address=? WHERE ID=?",author.getFirst_name(),author.getLast_name(),author.getAddress(),id);
    }

    @Override
    public void createAuthor(Author author) {
        jdbcTemplate.update("INSERT INTO AUTHOR(first_name,last_name,address) VALUES (?,?,?)",author.getFirst_name(),author.getLast_name(),author.getAddress());
    }

    @Override
    public void deleteAuthor(Integer id) {
        jdbcTemplate.update("DELETE FROM AUTHOR WHERE id=?",id);
    }
}

