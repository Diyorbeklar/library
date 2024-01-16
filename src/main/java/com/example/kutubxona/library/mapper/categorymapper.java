package com.example.kutubxona.library.mapper;

import com.example.kutubxona.library.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class categorymapper implements RowMapper<Category> {
    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Category(rs.getInt("id"),rs.getString("name"));
    }
}
