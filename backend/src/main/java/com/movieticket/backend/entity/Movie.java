package com.movieticket.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private String trailer;
    private String director; //đạo diễn
    private String cast; //diễn viên
    private String genre; //Thể loại
    private String running_time; //thời lượng phim
    private String rated; //giới hạn độ tuổi

}
