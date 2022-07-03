package com.movieticket.backend.repository;


import com.movieticket.backend.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    @Override
    Optional<Cinema> findById(Long id);
}
