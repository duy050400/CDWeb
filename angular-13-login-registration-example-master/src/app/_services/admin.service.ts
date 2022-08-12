import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Room } from '../_model/room';


const API_URL = 'http://localhost:8080/api/test/';
const ADMIN_API_URL = 'http://localhost:8080/api/admin/';


@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http: HttpClient) {  }
  
  getRoom(){
    return this.http.get<Room[]>(ADMIN_API_URL + 'room');
  }
  getCinema(){
    return this.http.get<any[]>(ADMIN_API_URL+'cinema')
  }
  getCinemaId(id:any){
    return this.http.get<any>(ADMIN_API_URL+'cinema/'+id)
  }
  deleteCinema(id:any){
    return this.http.get<any>(ADMIN_API_URL+'delete-cinema/'+id)
  }
  saveCinema(name:string,address:string,province_id:number,rooms:number[]){
    return this.http.post(ADMIN_API_URL+'savecinema',{
      name,
      address,
      province_id,
      rooms
    });
  }
  deteleMovie(id:any){
    return this.http.get<any>(ADMIN_API_URL+'delete-movie/'+id)
  }

  saveMovie(title:any,
  image:any,
  trailer:any,
  director:any,
  cast:any,
  genre:any,
  running_time:any,
  rated:any){
    return this.http.post(ADMIN_API_URL+'save-movie',{
      title,image,trailer,director,cast,genre,running_time,rated
    });
  }

  getMovieShowing(){
    return this.http.get<any[]>(ADMIN_API_URL+'movie-showing');
  }
}
