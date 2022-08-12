package com.movieticket.backend.entity;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "province_id", nullable = false, referencedColumnName = "id")
    @ToString.Exclude
    private Province province;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cinema_room", joinColumns = @JoinColumn(name = "cinema_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id"))
    @ToString.Exclude
    List<Room> rooms = new ArrayList<>();


}
