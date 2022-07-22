package com.movieticket.backend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MovieTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double total_price;

    @ManyToOne
    @JoinColumn(name = "movie_showing_id", nullable = false, referencedColumnName = "id")
    @ToString.Exclude
    private MovieShowing movieShowing;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
    @ToString.Exclude
    private User user;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "movieticket_seat", joinColumns = @JoinColumn(name = "movieshowing_id"),
            inverseJoinColumns = @JoinColumn(name = "seat_id"))
    @ToString.Exclude
    private List<MovieSeat> seats = new ArrayList<>();


}
