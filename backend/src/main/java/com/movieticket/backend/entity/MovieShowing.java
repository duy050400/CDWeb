package com.movieticket.backend.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MovieShowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false, referencedColumnName = "id")
    @ToString.Exclude

    private Movie movie;


    @ManyToOne
    @JoinColumn(name = "cinema_id", nullable = false, referencedColumnName = "id")
    @ToString.Exclude

    private Cinema cinema;


    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false, referencedColumnName = "id")
    @ToString.Exclude

    private Room room;

    private Time time;
    private Date date;

    private boolean isDeleted;


}
