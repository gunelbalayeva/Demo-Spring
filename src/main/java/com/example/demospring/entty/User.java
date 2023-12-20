package com.example.demospring.entty;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


@Data
@AllArgsConstructor
public class User {

    private int id;
    private String fullName;
    private LocalDate age;



}
