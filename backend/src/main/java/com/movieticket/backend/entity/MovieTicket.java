package com.movieticket.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;

import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_movie_showing;
    private double total;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "movieticket_seat", joinColumns = @JoinColumn(name = "movieticket_id"),
            inverseJoinColumns = @JoinColumn(name= "seat_id"))
    private List<Seat> rooms = new ArrayList<>();
}
