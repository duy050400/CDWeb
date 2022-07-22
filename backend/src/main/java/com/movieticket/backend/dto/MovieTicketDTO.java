package com.movieticket.backend.dto;

import com.movieticket.backend.entity.MovieSeat;
import com.movieticket.backend.entity.MovieShowing;
import com.movieticket.backend.entity.User;
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
public class MovieTicketDTO {
    private int id;
    private Double total_price;
    private MovieShowingDTO movieShowing;
    private UserDTO userDTO;
    private List<MovieSeat> seats = new ArrayList<>();

}
