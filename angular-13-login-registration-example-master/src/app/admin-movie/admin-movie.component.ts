import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AdminService } from '../_services/admin.service';
import { AuthService } from '../_services/auth.service';
import { TokenStorageService } from '../_services/token-storage.service';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-admin-movie',
  templateUrl: './admin-movie.component.html',
  styleUrls: ['./admin-movie.component.css']
})
export class AdminMovieComponent implements OnInit {
  movies:any[]=[];
  message = '';
  roles: string[] = [];
  isLoggedIn = false;
  showAdminBoard = false;
  showModeratorBoard = false;
  username?: string;
  

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
    this.getMovie();
    
  }
  getMovie(){
    this.userService.getMovie().subscribe({
      next:data =>{
        this.movies=data;
        console.log(data);
      }
    })
  }
  addMovie(f:NgForm){
    console.log(f.value);
    if(!f.valid){
      this.message="Vui lòng nhập đầy đủ thông tin";
    }else{
      this.adminService.saveMovie(f.value.title,f.value.iamge,f.value.trailer,f.value.director,f.value.cast,f.value.genre,f.value.running_time,f.value.rated).subscribe({
        next:data =>{
          console.log(data);
        }
      })
    }
    document.getElementById("close")?.click();
    window.location.reload()
  }

  deleted(id:any){
    this.adminService.deteleMovie(id).subscribe({
      next:data =>{
        console.log(data);
        document.getElementById("close")?.click();
      },
      error: err => {
        this.message = JSON.parse(err.error).message;
      }
    })

    
  }
}
