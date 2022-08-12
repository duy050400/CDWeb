package com.movieticket.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveMovieRequest {

    private String title;
    private String image;
    private String trailer;
    private String director;
    private String cast;
    private String genre;
    private String running_time;
    private String rated;
}
