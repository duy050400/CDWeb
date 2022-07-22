package com.movieticket.backend.repository;

import com.movieticket.backend.entity.MovieSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieSeatRepo extends JpaRepository<MovieSeat, Integer> {
}
