package com.example.kutubxona.library.controller;


import com.example.kutubxona.library.model.Category;
import com.example.kutubxona.library.service.categoryserverimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class categorycontroller {
    @Autowired
    com.example.kutubxona.library.service.categoryserverimpl categoryserverimpl;
    @GetMapping
    public List<Category> getcategorys(){
        return categoryserverimpl.getListCategory();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable("id") Integer id){
        return categoryserverimpl.getCategoryById(id);
    }
    @PostMapping()
    public void insertCategory(@RequestBody Category category){
        categoryserverimpl.createCategory(category);
    }
    @DeleteMapping()
    public void deleteCategory(@RequestBody Category category){

        categoryserverimpl.deleteCategory(category.getId());
    }
    @PutMapping("/{id}")
    public void updateCategory(@PathVariable("id") Integer id,@RequestBody Category category){
        categoryserverimpl.updateCategory(id,category);
    }

}



