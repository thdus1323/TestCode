package com.example.demo.ex01;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "category_tb")
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    User user;
}
