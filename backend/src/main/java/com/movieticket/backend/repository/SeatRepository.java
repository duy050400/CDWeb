package com.movieticket.backend.repository;

import com.movieticket.backend.entity.Cinema;
import com.movieticket.backend.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
