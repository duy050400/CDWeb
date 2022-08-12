package com.movieticket.backend.repository;

import com.movieticket.backend.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepo extends JpaRepository<Cinema, Integer> {
    @Query(value = "SELECT * FROM moviet_ticket.cinema where is_deleted = 0",nativeQuery = true)
    List<Cinema> findAllDeletedFalse();


}
