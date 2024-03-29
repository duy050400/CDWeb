package com.movieticket.backend.controller;


import com.movieticket.backend.dto.*;
import com.movieticket.backend.dto.reponse.MessageResponse;
import com.movieticket.backend.dto.request.BookingTicketRequest;
import com.movieticket.backend.entity.MovieSeat;
import com.movieticket.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;



    @GetMapping("/province")
    List<ProvinceDTO> provinceDTOList(){
        return userService.listProvince();
    }


    @GetMapping("/province/{id}")
    ProvinceDTO provinceDTO(@PathVariable("id") int id){
        return userService.provinceDTO(id);
    }
    @GetMapping("/movie")
    public List<MovieDTO> listMovie(){
        return userService.listMovieDTOS();
    }

    @GetMapping("/movie/{id}")
    MovieDTO movieDTO(@PathVariable("id") int id){
        return userService.movieDTO(id);
    }

    @GetMapping("/findticket/{movie_id}&{date}&{cinema_id}")
    public List<MovieShowingDTO> lists(@PathVariable("movie_id") int movie_id,
                                             @PathVariable("date") String date,
                                             @PathVariable("cinema_id") int cinema_id){
        return userService.movieShowingByMovieDate(movie_id,date,cinema_id);
    }

        @GetMapping("/seats")
    public List<MovieSeatDTO> movieSeatDTOList(){
        return userService.movieSeatDTOList();
        }
    @PostMapping("/booking")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<?> SaveBookingTicket(@Validated @RequestBody BookingTicketRequest bookingTicketRequest){
        if (bookingTicketRequest.getMovie_showing_id() == 0 || bookingTicketRequest.getUsername() == null || bookingTicketRequest.getSeats().isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Thiếu Dữ kiện!"));
        }

        String a = userService.SaveBooking(bookingTicketRequest.getMovie_showing_id(),bookingTicketRequest.getUsername(),bookingTicketRequest.getSeats());

        return ResponseEntity.ok(new MessageResponse(a));
    }



    @GetMapping("/seat_sold/{id}")
    public List<MovieSeatDTO> seatsSold(@PathVariable("id") int id){
        return userService.listSoldTicket(id);
    }

    @GetMapping("/ticket/{username}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public  List<MovieTicketDTO> movieTicketDTOList(@PathVariable("username") String username ){
        return userService.movieTicketDTOList(username);
    }
}
