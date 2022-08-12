package com.movieticket.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveCinemaRequest {
    private String name;
    private String address;
    private int province_id;
    private List<Integer> rooms;
}
