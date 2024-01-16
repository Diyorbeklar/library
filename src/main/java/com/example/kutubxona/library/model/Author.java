package com.example.kutubxona.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Author {
    private Integer id;
    private String first_name;
    private String last_name;
    private String address;
}
