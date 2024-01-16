package com.example.kutubxona.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Book {
    private Integer id;
    private String title;
    private Integer author_id;
    private Integer category_id;
    private Integer year;
    private String language;
}
