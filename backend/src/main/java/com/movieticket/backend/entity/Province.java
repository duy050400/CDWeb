package com.movieticket.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER, targetEntity = Cinema.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "province_id", referencedColumnName = "id")
    @JsonIgnoreProperties(value = "province", allowSetters = true)
    @ToString.Exclude
    private Set<Cinema> cinemas;


}
