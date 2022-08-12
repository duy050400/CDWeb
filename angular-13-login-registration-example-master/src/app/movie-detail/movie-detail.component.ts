import { Component, OnInit } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { ActivatedRoute } from '@angular/router';
import { Province } from '../_model/province';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-movie-detail',
  templateUrl: './movie-detail.component.html',
  styleUrls: ['./movie-detail.component.css']
})
export class MovieDetailComponent implements OnInit {
  movie:any;
  trailer:any;
  image:any;
  provinces:Province[] = [];
  province:any;

  movie_id='';
  cinema_id='';
  date='';

  constructor(private route:ActivatedRoute, private userService: UserService, private sanitizer: DomSanitizer) { 
    this.getMovie(this.route.snapshot.params['id']);
    this.getCinemaDefault();
  }

  ngOnInit(): void {
    this.getProvince();
    
  }
  getMovie(id:any){{
    this.userService.getMovieById(id).subscribe({
      next:data => {
        this.movie=data;
        this.trailer=this.sanitizer.bypassSecurityTrustResourceUrl(data.trailer);
        this.image=this.sanitizer.bypassSecurityTrustResourceUrl(data.image)
        console.log(this.trailer);
        console.log(data);
      }
    })
  }}
  getProvince(){
    this.userService.getProvince().subscribe({
      next:data =>{
        this.provinces=data;
        console.log(data);
      }
    })
  }
  getCinema(id_province:string){
    this.userService.getProvinceById(id_province).subscribe({
      next:data =>{
        this.province=data;
        console.log(data);
      }
    })
  }
  getCinemaDefault(){
    this.userService.getProvinceById("1").subscribe({
      next:data =>{
        this.province=data;
        console.log(data);
      }
    })
  }

  Booking(id_cinema:any){
    this.cinema_id=id_cinema;

  }
  getDate(){
    console.log(this.date)
  }
  
}
