package com.movieticket.backend.repository;

import java.util.Optional;

import com.movieticket.backend.common.ERole;
import com.movieticket.backend.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
