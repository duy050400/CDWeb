package com.movieticket.backend.repository;

import com.movieticket.backend.entity.Cinema;
import com.movieticket.backend.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
