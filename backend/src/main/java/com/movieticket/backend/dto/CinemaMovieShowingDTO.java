package com.movieticket.backend.dto;


import com.movieticket.backend.entity.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CinemaMovieShowingDTO {
    private int id;
    private String name;
    private String address;
    private ProvineCinemaDTO province;



}
