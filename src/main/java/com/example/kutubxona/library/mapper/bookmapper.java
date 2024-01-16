package com.example.kutubxona.library.mapper;

import com.example.kutubxona.library.model.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class bookmapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Book(rs.getInt("id"),rs.getString("title"),rs.getInt("author_id"),rs.getInt("category_id"),rs.getInt("year"),rs.getString("language"));
    }
}
