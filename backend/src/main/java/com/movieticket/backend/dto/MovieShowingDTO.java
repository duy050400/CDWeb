package com.movieticket.backend.dto;

import com.movieticket.backend.entity.Cinema;
import com.movieticket.backend.entity.Movie;
import com.movieticket.backend.entity.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieShowingDTO {
    private int id;
    private MovieDTO movie;
    private CinemaMovieShowingDTO cinema;
    private Room room;
    private Time time;
    private Date date;
}
