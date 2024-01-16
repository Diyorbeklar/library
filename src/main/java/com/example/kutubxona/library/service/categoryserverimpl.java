package com.example.kutubxona.library.service;

import com.example.kutubxona.library.dao.categoryimpl;
import com.example.kutubxona.library.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoryserverimpl implements categoryserver{
    @Autowired
    categoryimpl categoryimpl;
    @Override
    public List<Category> getListCategory() {
        return categoryimpl.getListCategory();
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryimpl.getCategoryById(id);
    }

    @Override
    public void updateCategory(Integer id, Category category) {
        categoryimpl.updateCategory(id,category);
    }

    @Override
    public void createCategory(Category category) {
        categoryimpl.createCategory(category);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryimpl.deleteCategory(id);
    }
}



