package com.movieticket.backend.controller;

import com.movieticket.backend.dto.CinemaDTO;
import com.movieticket.backend.dto.MovieDTO;
import com.movieticket.backend.dto.MovieShowingDTO;
import com.movieticket.backend.dto.RoomDTO;
import com.movieticket.backend.dto.reponse.MessageResponse;
import com.movieticket.backend.dto.request.BookingTicketRequest;
import com.movieticket.backend.dto.request.SaveCinemaRequest;
import com.movieticket.backend.dto.request.SaveMovieRequest;
import com.movieticket.backend.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/room")
    @PreAuthorize("hasRole('ADMIN')")
    List<RoomDTO> roomDTOList(){
        return adminService.roomDTOList();
    }
    @PostMapping("/savecinema")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> SaveBookingTicket(@Validated @RequestBody SaveCinemaRequest saveCinemaRequest){
        String a = adminService.saveCinema(saveCinemaRequest.getName(),saveCinemaRequest.getAddress(),saveCinemaRequest.getProvince_id(),saveCinemaRequest.getRooms());
        return ResponseEntity.ok(new MessageResponse(a));
    }
    @GetMapping("/cinema")
    @PreAuthorize("hasRole('ADMIN')")
    List<CinemaDTO> cinemaDTOList(){
        return adminService.cinemaDTOList();
    }

    @GetMapping("cinema/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    CinemaDTO cinemaDTO(@PathVariable("id") int id){
        return adminService.cinemaDTO(id);
    }

    @GetMapping("/delete-cinema/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> deleteCinema(@PathVariable("id")int id){


        String a = adminService.deleteCinema(id);

        return ResponseEntity.ok(new MessageResponse(a));
    }

    @PostMapping("/save-movie")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> saveMovie(@Validated @RequestBody SaveMovieRequest saveMovieRequest ){


        String a = adminService.addMovie(saveMovieRequest);

        return ResponseEntity.ok(new MessageResponse(a));
    }

    @GetMapping("delete-movie/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> deletemovie(@PathVariable("id")int id){


        String a = adminService.deletedMovie(id);

        return ResponseEntity.ok(new MessageResponse(a));
    }

    @GetMapping("movie-showing")
    @PreAuthorize("hasRole('ADMIN')")
        public List<MovieShowingDTO> movieShowingDTOList(){
           return adminService.movieShowingDTOList();
        }

}
