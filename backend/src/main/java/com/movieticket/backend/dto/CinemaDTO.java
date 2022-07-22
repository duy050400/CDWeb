package com.movieticket.backend.dto;


import com.movieticket.backend.entity.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CinemaDTO {
    private int id;
    private String name;
    private String address;
    private ProvineCinemaDTO province;
    List<Room> rooms = new ArrayList<>();


}
