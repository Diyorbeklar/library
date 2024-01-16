package com.example.kutubxona.library.dao;

import com.example.kutubxona.library.model.Category;

import java.util.List;

public interface categorydao {
    public List<Category> getListCategory();
    public Category getCategoryById(Integer id);
    void updateCategory(Integer id, Category category);
    void createCategory(Category category);
    void deleteCategory(Integer id);
}
