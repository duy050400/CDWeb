package com.movieticket.backend.repository;


import com.movieticket.backend.entity.Cinema;
import com.movieticket.backend.entity.MovieShowing;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieShowingRepo extends JpaRepository<MovieShowing, Integer> {

    List<MovieShowing> findByCinema(Cinema cinema);


    @Query(value = "SELECT * FROM moviet_ticket.movie_showing where cinema_id = ?1",nativeQuery = true)
    List<MovieShowing> findByCinemaID(int cinema_id);
    @Query(value = "SELECT * FROM moviet_ticket.movie_showing where movie_id = ?1 and time>?2 and date = ?3",nativeQuery = true)
    List<MovieShowing> findByDateTime(int movie_id,String time, String date);
}
