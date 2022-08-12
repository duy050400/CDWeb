import { Component, OnInit } from '@angular/core';
import { AdminService } from '../_services/admin.service';
import { AuthService } from '../_services/auth.service';
import { TokenStorageService } from '../_services/token-storage.service';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-admin-movie-showing',
  templateUrl: './admin-movie-showing.component.html',
  styleUrls: ['./admin-movie-showing.component.css']
})
export class AdminMovieShowingComponent implements OnInit {
  movieShowings:any[]=[];
  cinemas:any[]=[];
  movies:any[]=[];

  roles: string[] = [];
  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  username?: string;
  message = '';
  

  constructor(private userService: UserService, private adminService: AdminService, private tokenStorageService: TokenStorageService, private authService: AuthService) {
    if (this.tokenStorageService.getToken()) {
      this.isLoggedIn = true;
      this.roles = this.tokenStorageService.getUser().roles;
    }

    this.isLoggedIn = !!this.tokenStorageService.getToken();

    if (this.isLoggedIn) {
      const user = this.tokenStorageService.getUser();
      this.roles = user.roles;

      this.showAdminBoard = this.roles.includes('ROLE_ADMIN');
   

      this.username = user.username;
    }
   }
  ngOnInit(): void {
    this.getMovieShowing();
    this.getCinema();
    this.getMovie();
  }
  getMovieShowing(){
    this.adminService.getMovieShowing().subscribe({
      next:data =>{
        this.movieShowings=data;
        console.log(data);
      }
    })
  }
  getCinema(){
    this.adminService.getCinema().subscribe({
      next:data =>{
        this.cinemas=data;
      }
    })
  }
  getMovie(){
    this.userService.getMovie().subscribe({
      next: data => {
        this.movies = data;
        console.log(data)
      }
    });
  }
}
