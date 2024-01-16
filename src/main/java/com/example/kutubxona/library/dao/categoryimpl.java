package com.example.kutubxona.library.dao;

import com.example.kutubxona.library.mapper.categorymapper;
import com.example.kutubxona.library.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class categoryimpl implements categorydao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Category> getListCategory() {
        return (List<Category>) jdbcTemplate.query("SELECT * FROM CATEGORY",new categorymapper());
    }

    @Override
    public Category getCategoryById(Integer id) {
        return (Category) jdbcTemplate.queryForObject("SELECT * FROM CATEGORY WHERE ID=?",new Object[]{id},new categorymapper());
    }

    @Override
    public void updateCategory(Integer id, Category category) {
        jdbcTemplate.update("CATEGORY AUTHOR SET name=?WHERE ID=?",category.getName(),id);
    }

    @Override
    public void createCategory(Category category) {
        jdbcTemplate.update("INSERT INTO CATEGORY(name) VALUES (?)",category.getName());
    }

    @Override
    public void deleteCategory(Integer id) {
        jdbcTemplate.update("DELETE FROM CATEGORY WHERE id=?",id);
    }

}
