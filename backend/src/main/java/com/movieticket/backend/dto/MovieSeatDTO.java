package com.movieticket.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieSeatDTO {
    private int id;
    private String id_row;
    private int id_colum;
    private double price;
}
