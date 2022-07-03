package com.movieticket.backend.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "cinema_room", joinColumns = @JoinColumn(name = "cinema_id"),
            inverseJoinColumns = @JoinColumn(name= "room_id"))
    private List<Room> rooms = new ArrayList<>();




}
