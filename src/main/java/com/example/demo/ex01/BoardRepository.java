package com.example.demo.ex01;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {

    @Query(value = "select * from board_tb where user_id = ?", nativeQuery = true)
    List<Board> myBlogList(@Param("userId") int userId);

    List<Board> findByUser_id(@Param("id") Integer id);

}
