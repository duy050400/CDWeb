package com.movieticket.backend.services;

import com.movieticket.backend.dto.CinemaDTO;
import com.movieticket.backend.dto.MovieDTO;
import com.movieticket.backend.dto.MovieShowingDTO;
import com.movieticket.backend.dto.RoomDTO;
import com.movieticket.backend.dto.request.SaveMovieRequest;
import com.movieticket.backend.entity.*;
import com.movieticket.backend.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    ProvinceRepo provinceRepo;

    @Autowired
    CinemaRepo cinemaRepo;

    @Autowired
    MovieRepo movieRepo;

    @Autowired
    MovieTicketRepo movieTicketRepo;

    @Autowired
    MovieShowingRepo movieShowingRepo;

    @Autowired
    UserRepository userRepository;

    @Autowired
    MovieSeatRepo movieSeatRepo;

    @Autowired
    RoomRepo roomRepo;

    public List<RoomDTO> roomDTOList(){
        List<Room> rooms = roomRepo.findAll();
        List<RoomDTO> roomDTOS = new ArrayList<>();
        for(Room room:rooms){
            RoomDTO roomDTO = modelMapper.map(room,RoomDTO.class);
            roomDTOS.add(roomDTO);
        }
        return roomDTOS;
    }

    public String saveCinema(String name,String address,int provinceId, List<Integer> rooms){
        Cinema cinema = new Cinema();
        Province province = provinceRepo.findById(provinceId).orElseThrow(() -> new RuntimeException("Error: province is not found."));
        List<Room> roomList = roomRepo.findAllById(rooms);
        cinema.setName(name);
        cinema.setAddress(address);
        cinema.setProvince(province);
        cinema.setRooms(roomList);
        cinema.setDeleted(false);
        cinemaRepo.save(cinema);
        return "Save Done";
    }

    public  List<CinemaDTO> cinemaDTOList(){
        List<Cinema> cinemas = cinemaRepo.findAllDeletedFalse();
        List<CinemaDTO> cinemaDTOList = new ArrayList<>();
        for(Cinema cinema : cinemas){
            CinemaDTO cinemaDTO = modelMapper.map(cinema, CinemaDTO.class);
            cinemaDTOList.add(cinemaDTO);
        }
        return cinemaDTOList;
    }

    public CinemaDTO cinemaDTO(int id){
        Cinema cinema = cinemaRepo.findById(id).orElseThrow(() -> new RuntimeException("Error: not found."));
        CinemaDTO cinemaDTO = modelMapper.map(cinema,CinemaDTO.class);
        return cinemaDTO;
    }
    public String deleteCinema(int id){
        Cinema cinema = cinemaRepo.findById(id).orElseThrow(() -> new RuntimeException("Error: not found."));
        cinema.setDeleted(true);
        cinemaRepo.save(cinema);
        return "Delete Done";
    }

    public String addMovie(SaveMovieRequest movieDTO){
        Movie movie = new Movie();
        movie.setTitle(movieDTO.getTitle());
        movie.setImage(movieDTO.getImage());
        movie.setTrailer(movieDTO.getTrailer());
        movie.setDirector(movieDTO.getDirector());
        movie.setCast(movieDTO.getCast());
        movie.setGenre(movieDTO.getGenre());
        movie.setRunning_time(movieDTO.getRunning_time());
        movie.setRated(movieDTO.getRated());
        movie.setDeleted(false);

        movieRepo.save(movie);

        return "Save Done";
    }

    public String deletedMovie(int id){
        Movie movie = movieRepo.findById(id).orElse(null);
        movie.setDeleted(true);
        movieRepo.save(movie);
        return "Delete done";
    }

    public String addMovieShowing(int id_movie,int id_cinema, int id_room, String time,String date) throws ParseException {
        Movie movie = movieRepo.findById(id_movie).orElse(null);
        Cinema cinema = cinemaRepo.findById(id_cinema).orElse(null);
        Room room = roomRepo.findById(id_room).orElse(null);
        MovieShowing movieShowing = new MovieShowing();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");  ;

        movieShowing.setMovie(movie);
        movieShowing.setCinema(cinema);
        movieShowing.setRoom(room);
        movieShowing.setTime((Time) sdf.parse(time));
        movieShowing.setDate((Date)sdf1.parse(date));

        movieShowingRepo.save(movieShowing);
        return "Save Done";
    }
    public List<MovieShowingDTO> movieShowingDTOList(){
        List<MovieShowing> movieShowingList = movieShowingRepo.findAllIsDelete();
        List<MovieShowingDTO>movieShowingDTOList = new ArrayList<>();
        for(MovieShowing movieShowing:movieShowingList){
            MovieShowingDTO movieShowingDTO = modelMapper.map(movieShowing,MovieShowingDTO.class);
            movieShowingDTOList.add(movieShowingDTO);
        }
        return movieShowingDTOList;

    }
}
