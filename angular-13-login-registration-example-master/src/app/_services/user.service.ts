import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Movie } from '../_model/movie';
import { Province } from '../_model/province';
import { Seats } from '../_model/seats';

const API_URL = 'http://localhost:8080/api/test/';
const USER_API_URL = 'http://localhost:8080/api/user/';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  constructor(private http: HttpClient) { }

  getMovie() {
    return this.http.get<Movie[]>(USER_API_URL + 'movie');
  }
  getProvince(){
    return this.http.get<Province[]>(USER_API_URL + 'province');
  }
  getProvinceById(id_province:string){
    return this.http.get<Province>(USER_API_URL + 'province/' +id_province);
  }
  getMovieById(id_movie:string){
    return this.http.get<Movie>(USER_API_URL + 'movie/'+ id_movie);
  }
  getSeats(){
    return this.http.get<Seats[]>(USER_API_URL+'seats')
  }
  getSeatSold(id_movie_showing:any){
    return this.http.get<Seats[]>(USER_API_URL+'seat_sold/'+id_movie_showing)
  }
  
  getMovieShowing(id_movie:any,date:any,id_cinema:any){
    return this.http.get<any[]>(USER_API_URL+'findticket/'+id_movie+'&'+date+'&'+id_cinema);
  }
  postBooking(movie_showing_id:any,
    username:any,
    seats:number[]){
      return this.http.post(USER_API_URL+'booking',{movie_showing_id,username,seats})
    }
  getTicket(username:any){
    return this.http.get<any[]>(USER_API_URL+'ticket/'+username)
  }
  getUserBoard(): Observable<any> {
    return this.http.get(API_URL + 'user', { responseType: 'text' });
  }

  getModeratorBoard(): Observable<any> {
    return this.http.get(API_URL + 'mod', { responseType: 'text' });
  }

  getAdminBoard(): Observable<any> {
    return this.http.get(API_URL + 'admin', { responseType: 'text' });
  }
}
