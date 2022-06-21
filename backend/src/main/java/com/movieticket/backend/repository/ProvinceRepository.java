package com.movieticket.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieticket.backend.entity.Province;

public interface ProvinceRepository extends JpaRepository<Province, Long> {
    
}
