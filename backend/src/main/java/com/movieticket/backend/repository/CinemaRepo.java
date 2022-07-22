package com.movieticket.backend.repository;

import com.movieticket.backend.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepo extends JpaRepository<Cinema, Integer> {
}
