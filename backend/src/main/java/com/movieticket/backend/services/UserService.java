package com.movieticket.backend.services;



import com.movieticket.backend.dto.*;
import com.movieticket.backend.entity.*;
import com.movieticket.backend.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

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




    public List<MovieDTO> listMovieDTOS(){
        List<Movie> movieList = movieRepo.findAll();
        List<MovieDTO> movieDTOList = new ArrayList<>();
        for(Movie movie : movieList){
            MovieDTO movieDTO = modelMapper.map(movie, MovieDTO.class);
            movieDTOList.add(movieDTO);
        }
        return movieDTOList;
    }
    public List<ProvinceDTO> listProvince() {
        List<Province> provinces = provinceRepo.findAll();
        List<ProvinceDTO> provinceDTOSList = new ArrayList<>();
        for(Province province : provinces){
            ProvinceDTO provinceDTO = modelMapper.map(province,ProvinceDTO.class);
            provinceDTOSList.add(provinceDTO);
        }
        return provinceDTOSList;
    }

    public ProvinceDTO provinceDTO(int id) {
        Province province = provinceRepo.findById(id).orElseThrow(() -> new RuntimeException("Error: Province is not found."));
        ProvinceDTO provinceDTO = modelMapper.map(province, ProvinceDTO.class);
        return provinceDTO;
    }


    public CinemaDTO cinemaDTO(int id) {
        Cinema cinema = cinemaRepo.findById(id).orElseThrow(() -> new RuntimeException("Error: Cinema is not found."));
        CinemaDTO cinemaDTO = modelMapper.map(cinema, CinemaDTO.class);
        return cinemaDTO;
    }

    public List<MovieShowingDTO> movieShowing() {
        List<MovieShowing> movieShowingList = movieShowingRepo.findAll();
        List<MovieShowingDTO> movieShowingDTOSList = new ArrayList<>();
        for(MovieShowing movieShowing : movieShowingList){
            MovieShowingDTO movieShowingDTO =modelMapper.map(movieShowing,MovieShowingDTO.class);
            movieShowingDTOSList.add(movieShowingDTO);
        }

        return movieShowingDTOSList;
    }

    public List<MovieShowingDTO> movieShowingByCinema(int id_cinema) {
        Cinema cinema = cinemaRepo.findById(id_cinema).orElseThrow(() -> new RuntimeException("Error: Cinema is not found."));
        List<MovieShowing> movieShowingList = movieShowingRepo.findByCinema(cinema);
        List<MovieShowingDTO> movieShowingDTOSList = new ArrayList<>();
        for(MovieShowing movieShowing : movieShowingList){
            MovieShowingDTO movieShowingDTO =modelMapper.map(movieShowing,MovieShowingDTO.class);
            movieShowingDTOSList.add(movieShowingDTO);
        }
        return movieShowingDTOSList;
    }

    public List<MovieShowingDTO> movieShowingByMovieDate(int movie_id,String date) {
        long now = System.currentTimeMillis();
        Time time = new Time(now);

        List<MovieShowing> movieShowingList = movieShowingRepo.findByDateTime(movie_id,time.toString(), date);
        List<MovieShowingDTO> movieShowingDTOSList = new ArrayList<>();
        for(MovieShowing movieShowing : movieShowingList){
            MovieShowingDTO movieShowingDTO =modelMapper.map(movieShowing,MovieShowingDTO.class);
            movieShowingDTOSList.add(movieShowingDTO);
        }
        return movieShowingDTOSList;
    }

    public List<MovieShowingDTO> movieShowingByCinemaID() {
        List<MovieShowing> movieShowingList = movieShowingRepo.findByCinemaID(2);
        List<MovieShowingDTO> movieShowingDTOSList = new ArrayList<>();
        for(MovieShowing movieShowing : movieShowingList){
            MovieShowingDTO movieShowingDTO =modelMapper.map(movieShowing,MovieShowingDTO.class);
            movieShowingDTOSList.add(movieShowingDTO);
        }
        return movieShowingDTOSList;
    }

    public String SaveBooking(int movie_showing_id, int user_id, List<Integer> seat){
        MovieShowing movieShowing = movieShowingRepo.findById(movie_showing_id).orElseThrow(() -> new RuntimeException("Error: MovieShowing is not found."));
        User user = userRepository.findById((long)user_id).orElseThrow(() -> new RuntimeException("Error: User is not found."));
        List<MovieSeat> seats = movieSeatRepo.findAllById(seat);
        double total = 0;
        for(MovieSeat movieSeat : seats){
            total = total + movieSeat.getPrice();
        }

        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setUser(user);
        movieTicket.setSeats(seats);
        movieTicket.setMovieShowing(movieShowing);
        movieTicket.setTotal_price(total);
        movieTicketRepo.save(movieTicket);
        return "Save done";
    }

    public List<MovieTicketDTO> movieTicketByUserId(int user_id){
        //User user = userRepository.findById((long)user_id).orElseThrow(() -> new RuntimeException("Error: User is not found."));
        List<MovieTicket> movieTickets = movieTicketRepo.findByUserId(user_id);
        List<MovieTicketDTO> movieTicketDTOS = new ArrayList<>();
        for (MovieTicket movieTicket : movieTickets){
            MovieTicketDTO movieTicketDTO = modelMapper.map(movieTicket,MovieTicketDTO.class);
            UserDTO userDTO = modelMapper.map(movieTicket.getUser(),UserDTO.class);
            MovieShowingDTO movieShowingDTO = modelMapper.map(movieTicket.getMovieShowing(),MovieShowingDTO.class);
            movieTicketDTO.setUserDTO(userDTO);
            movieTicketDTO.setMovieShowing(movieShowingDTO);
            movieTicketDTOS.add(movieTicketDTO);
        }
        return movieTicketDTOS;


    }

    public List<MovieSeatDTO> movieSeatSold(int movie_showing_id){
        List<MovieSeatDTO> movieSeatDTOS = new ArrayList<>();
        List<MovieTicket> movieTickets = movieTicketRepo.findByMovieShowingID(1);
        for(MovieTicket movieTicket : movieTickets){
            for(MovieSeat movieSeat : movieTicket.getSeats()){
                MovieSeatDTO movieSeatDTO = modelMapper.map(movieSeat,MovieSeatDTO.class);
                movieSeatDTOS.add(movieSeatDTO);
            }
        }
        return movieSeatDTOS;
    }
}
