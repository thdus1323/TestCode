package com.example.demo.ex01;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "user_tb")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
}