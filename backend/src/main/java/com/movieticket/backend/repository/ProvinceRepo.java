package com.movieticket.backend.repository;

import com.movieticket.backend.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProvinceRepo extends JpaRepository<Province, Integer> {
    Optional<Province> findByname(String name);
}
