package com.movieticket.backend.services;

import com.movieticket.backend.entity.*;
import com.movieticket.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    @Autowired
    CinemaRepository cinemaRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    MovieShowingRepository movieShowingRepository;
    @Autowired
    MovieTicketRepository movieTicketRepository;
    @Autowired
    ProvinceRepository provinceRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    SeatRepository seatRepository;


    public List<Cinema> listCinema(){
        List<Cinema> list = cinemaRepository.findAll();
        return list;
    }

    public List<Movie> listMovie(){
        List<Movie> list = movieRepository.findAll();
        return list;
    }

    public List<MovieShowing> listMovieShowing(){
        List<MovieShowing> list = movieShowingRepository.findAll();
        return list;
    }

    public List<MovieTicket> listMovieTicket(){
        List<MovieTicket> list = movieTicketRepository.findAll();
        return list;
    }

    public List<Province> listProvince(){
        List<Province> list = provinceRepository.findAll();
        return list;
    }

    public List<Room> listRoom(){
        List<Room> list = roomRepository.findAll();
        return list;
    }

    public List<Seat> listSeat(){
        List<Seat> list = seatRepository.findAll();
        return list;
    }
}
