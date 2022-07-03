package com.movieticket.backend.repository;

import com.movieticket.backend.entity.Cinema;
import com.movieticket.backend.entity.MovieTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieTicketRepository extends JpaRepository<MovieTicket, Long> {
}
