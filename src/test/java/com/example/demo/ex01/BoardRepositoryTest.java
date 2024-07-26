package com.example.demo.ex01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest//달고
class BoardRepositoryTest {

    @Autowired //땡겨와야 해
    private BoardRepository boardRepository;

    @Test
    public void findByTitle() {
        //given_파라미터
        Integer userId = 1;

        //when
        boardRepository.myBlogList(userId);

        //then
    }

}