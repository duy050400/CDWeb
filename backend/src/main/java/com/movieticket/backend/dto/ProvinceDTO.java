package com.movieticket.backend.dto;

import com.movieticket.backend.entity.Cinema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProvinceDTO {
    private int id;
    private String name;
    private Set<Cinema> cinemas;


}
