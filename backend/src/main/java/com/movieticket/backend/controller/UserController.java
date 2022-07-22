package com.movieticket.backend.controller;


import com.movieticket.backend.dto.MovieDTO;
import com.movieticket.backend.dto.MovieShowingDTO;
import com.movieticket.backend.dto.MovieTicketDTO;
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

    @GetMapping("/movie")
    public List<MovieDTO> listMovie(){
        return userService.listMovieDTOS();
    }

    @GetMapping("/findticket/{movie_id}&{date}")
    public List<MovieShowingDTO> lists(@PathVariable("movie_id") int movie_id,
                                             @PathVariable("date") String date){
        return userService.movieShowingByMovieDate(movie_id,date);
    }

    @PostMapping("/booking")

    public ResponseEntity<?> SaveBookingTicket(@Validated @RequestBody BookingTicketRequest bookingTicketRequest){
        if (bookingTicketRequest.getMovie_showing_id() == 0 || bookingTicketRequest.getUser_id() == 0 || bookingTicketRequest.getSeats().isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Thiếu Dữ kiện!"));
        }

        String a = userService.SaveBooking(bookingTicketRequest.getMovie_showing_id(),bookingTicketRequest.getUser_id(),bookingTicketRequest.getSeats());

        return ResponseEntity.ok(new MessageResponse(a));
    }

    @GetMapping("/choose_seat")
    public List<MovieTicketDTO> movieTicketByUserId(){
        return userService.movieTicketByUserId(1);
    }


}
