package com.movieticket.backend.entity;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER,targetEntity = Cinema.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "province_id", referencedColumnName = "id")
    private List<Cinema> cinemas;


}   
