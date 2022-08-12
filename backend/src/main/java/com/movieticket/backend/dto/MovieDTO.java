package com.movieticket.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieDTO {
    private int id;
    private String title;
    private String image;
    private String trailer;
    private String director;
    private String cast;
    private String genre;
    private String running_time;
    private String rated;


}
