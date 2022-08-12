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

    @Autowired
    RoomRepo roomRepo;


    public List<MovieDTO> listMovieDTOS(){
        List<Movie> movieList = movieRepo.findAllByIsDeleted();
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

    public List<MovieShowingDTO> movieShowingByMovieDate(int movie_id,String date, int cinema_id) {
        long now = System.currentTimeMillis();
        Time time = new Time(now);

        List<MovieShowing> movieShowingList = movieShowingRepo.findByDateTimeCinema(movie_id,time.toString(), date,cinema_id);
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

    public String SaveBooking(int movie_showing_id, String username, List<Integer> seat){
        MovieShowing movieShowing = movieShowingRepo.findById(movie_showing_id).orElseThrow(() -> new RuntimeException("Error: MovieShowing is not found."));
        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("Error: User is not found."));
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

    public MovieDTO movieDTO(int id){
        Movie movie = movieRepo.findByIdIsDeleted(id).orElseThrow(() -> new RuntimeException("Error: User is not found."));
        MovieDTO movieDTO = modelMapper.map(movie,MovieDTO.class);
        return movieDTO;

    }
    public List<MovieSeatDTO> movieSeatDTOList(){
        List<MovieSeat> movieSeatList = movieSeatRepo.findAll();
        List<MovieSeatDTO> movieSeatDTOList = new ArrayList<>();
        for(MovieSeat movieSeat:movieSeatList){
            MovieSeatDTO movieSeatDTO = modelMapper.map(movieSeat,MovieSeatDTO.class);
            movieSeatDTOList.add(movieSeatDTO);
        }
        return movieSeatDTOList;

    }

    public List<MovieSeatDTO> listSoldTicket(int id_movie_showing){
        MovieShowing movieShowing = movieShowingRepo.findById(id_movie_showing).orElseThrow(() -> new RuntimeException("Error:not found."));
        List<MovieTicket> movieTicketList = movieTicketRepo.findByMovieShowingID(id_movie_showing);
        List<MovieSeatDTO>movieSeatDTOList = new ArrayList<>();
        for(MovieTicket movieTicket:movieTicketList){
            for(MovieSeat movieSeat:movieTicket.getSeats()){
                MovieSeatDTO movieSeatDTO = modelMapper.map(movieSeat,MovieSeatDTO.class);
                movieSeatDTOList.add(movieSeatDTO);
            }

        }
        return movieSeatDTOList;
    }

    public List<MovieTicketDTO> movieTicketDTOList(String username){
        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("Error: User is not found."));
        List<MovieTicket> movieTicketList =movieTicketRepo.findByUserId(Integer.valueOf(user.getId().intValue()));
        List<MovieTicketDTO> movieTicketDTOList = new ArrayList<>();
        for(MovieTicket movieTicket:movieTicketList){
            MovieTicketDTO movieTicketDTO = modelMapper.map(movieTicket,MovieTicketDTO.class);
            movieTicketDTOList.add(movieTicketDTO);
        }
        return movieTicketDTOList;
    }
}
