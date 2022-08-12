import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Seats } from '../_model/seats';
import { AuthService } from '../_services/auth.service';
import { TokenStorageService } from '../_services/token-storage.service';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  seats: Seats[] = [];
  seatSold: Seats[] = [];
  disable: any[] = [];
  movieShowing: any;
  idseats: number[] = [];
  idseatSold: number[] = [];
  idSeatChosse: number[] = [];
  idMovieShowing: number | undefined;

  isLoggedIn = false;
  username?: string;
  roles: string[] = [];

  mess: any;

  qeryMovieId = '';
  qeryDate = '';
  qeryCinemaId = '';
  constructor(private userService: UserService, private activatedRoute: ActivatedRoute, private tokenStorageService: TokenStorageService, private authService: AuthService, private router: Router) {
    this.activatedRoute.queryParams.subscribe(data => {
      this.qeryMovieId = data['movieid'];
      this.qeryDate = data['date'];
      this.qeryCinemaId = data['cinemaid'];
      this.userService.getMovieShowing(this.qeryMovieId, this.qeryDate, this.qeryCinemaId).subscribe({
        next: data => {
          this.movieShowing = data;
        }
      })
    })
    if (this.tokenStorageService.getToken()) {
      this.isLoggedIn = true;
      this.roles = this.tokenStorageService.getUser().roles;
    }

    this.isLoggedIn = !!this.tokenStorageService.getToken();

    if (this.isLoggedIn) {
      const user = this.tokenStorageService.getUser();
      this.roles = user.roles;


      this.username = user.username;
    }

  }

  ngOnInit(): void {
    this.getSeats();





  }
  getSeats() {
    this.userService.getSeats().subscribe({
      next: data => {
        this.seats = data;

      }
    })
  }
  getSeatSold(movie_id: number) {

    this.getSeats();
    this.idseats = [];
    this.disable = [];
    this.idseatSold = []

    this.seats.forEach((value) => {
      this.idseats.push(value.id)
    })
    console.log(this.idseats);
    this.userService.getSeatSold(movie_id).subscribe({
      next: data => {
        this.seatSold = data;
        console.log(data);
        data.forEach((value) => {
          this.idseatSold.push(value.id);
        });

        this.idseats.forEach((value) => {
          this.disable.push(this.idseatSold.includes(value))

        })
        console.log(this.disable)


      }
    })


  }
  booking(f: any) {
    console.log(f.value);
    if (!this.isLoggedIn) {
      alert("Vui lòng đăng nhập");
    } else {
      if (this.idSeatChosse.length==0) {
        alert("Bạn chưa chọn ghế")
      } else {
        this.userService.postBooking(this.idMovieShowing, this.username, this.idSeatChosse).subscribe({
          next: data => {
            this.mess = data;
            console.log(data);
            this.router.navigate(["/ticket"])
          }
        })
      }

    }
    


  }
  checkbox(id: any) {
    console.log(id);
    this.idSeatChosse.push(id);
    console.log(this.idSeatChosse);

  }
  time(id: any) {
    console.log(id);
    this.getSeatSold(id);
    this.idMovieShowing = id;


  }


}
