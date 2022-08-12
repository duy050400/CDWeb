package com.movieticket.backend;


import com.movieticket.backend.entity.MovieShowing;
import com.movieticket.backend.entity.MovieTicket;
import com.movieticket.backend.entity.User;
import com.movieticket.backend.repository.*;
import com.movieticket.backend.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BackendApplicationTests {
    @Autowired
    UserService userService;

    @Autowired
    MovieTicketRepo movieTicketRepo;

    @Autowired
    UserRepository userRepository;


    @Test
    void tes1() {

        System.out.println(userService.cinemaDTOList());


    }

}



