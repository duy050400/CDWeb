package com.movieticket.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingTicketRequest {
    private int movie_showing_id;
    private String username;
    private List<Integer> seats = new ArrayList<>();
}
