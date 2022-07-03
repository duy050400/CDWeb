package com.movieticket.backend.repository;


import com.movieticket.backend.entity.MovieShowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieShowingRepository extends JpaRepository<MovieShowing, Long> {
}
