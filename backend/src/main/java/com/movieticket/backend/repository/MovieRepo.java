package com.movieticket.backend.repository;

import com.movieticket.backend.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {
    @Query(value = "SELECT * FROM moviet_ticket.movie where is_deleted=0",nativeQuery = true)
    List<Movie> findAllByIsDeleted();
    @Query(value = "SELECT * FROM moviet_ticket.movie where id = ?1 and is_deleted=0;",nativeQuery = true)
    Optional<Movie> findByIdIsDeleted(int id);
}
