package com.example.kutubxona.library.dao;

import com.example.kutubxona.library.mapper.bookmapper;
import com.example.kutubxona.library.mapper.bookmapper;
import com.example.kutubxona.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class bookimpl implements bookdao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Book> getListBook() {
        return (List<Book>) jdbcTemplate.query("SELECT * FROM BOOK",new bookmapper());
    }

    @Override
    public Book getBookById(Integer id) {
        return (Book) jdbcTemplate.queryForObject("SELECT * FROM BOOK WHERE ID=?",new Object[]{id},new bookmapper());
    }

    @Override
    public void updateBook(Integer id, Book book) {
        jdbcTemplate.update("UPDATE BOOK SET title=?,author_id=?,category_id=?,year=?,language=? WHERE ID=?",book.getTitle(),book.getAuthor_id(),book.getCategory_id(),book.getYear(),book.getLanguage(),id);
    }

    @Override
    public void createBook(Book book) {
        jdbcTemplate.update("INSERT INTO BOOK(title,author_id,category_id,year,language) VALUES (?,?,?,?,?)",book.getTitle(),book.getAuthor_id(),book.getCategory_id(),book.getYear(),book.getLanguage());
    }

    @Override
    public void deleteBook(Integer id) {
        jdbcTemplate.update("DELETE FROM BOOK WHERE id=?",id);
    }
}
