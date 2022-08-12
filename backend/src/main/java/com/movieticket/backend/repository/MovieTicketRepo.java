package com.movieticket.backend.repository;

import com.movieticket.backend.entity.MovieTicket;
import com.movieticket.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MovieTicketRepo extends JpaRepository<MovieTicket, Integer> {
    @Query(value = "SELECT * FROM moviet_ticket.movie_ticket where user_id = ?1",nativeQuery = true)
    List<MovieTicket> findByUserId(int user_id);

    @Query(value = "SELECT * FROM moviet_ticket.movie_ticket where movie_showing_id = ?1",nativeQuery = true)
    List<MovieTicket> findByMovieShowingID(int movie_showing_id);


}
