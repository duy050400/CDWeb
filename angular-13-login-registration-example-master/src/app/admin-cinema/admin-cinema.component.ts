import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Province } from '../_model/province';
import { Room } from '../_model/room';
import { AdminService } from '../_services/admin.service';
import { AuthService } from '../_services/auth.service';
import { TokenStorageService } from '../_services/token-storage.service';
import { UserService } from '../_services/user.service';

export interface Form {
  name: String;
  address: string;
  id_province: string;
  room: string[];
}

@Component({
  selector: 'app-admin-cinema',
  templateUrl: './admin-cinema.component.html',
  styleUrls: ['./admin-cinema.component.css']
})
export class AdminCinemaComponent implements OnInit {

  message = '';
  save:any;
  provinces: Province[] = [];
  rooms: Room[] = [];
  cinemas:any[]=[];
  cinema:any;
  deleteds:any;

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
    this.getProvine();
    this.getRoom();
    this.getCinema();


  }
  getCinema(){
    this.adminService.getCinema().subscribe({
      next:data =>{
        this.cinemas=data;
      }
    })
  }
  getProvine() {
    this.userService.getProvince().subscribe({
      next: data => {
        this.provinces = data;
        console.log(data);
      }
    })
  }
  getRoom() {
    this.adminService.getRoom().subscribe({
      next: data => {
        this.rooms = data;
        console.log(data);
      }
    })

  }
  addCinema(f: NgForm) {
    if (!f.valid) {
      this.message = "Thiếu dữ kiện"
    } else {
      let roomss: any[] = f.value.rooms;
      let rooms:number[]=[];
      for (let i = 1; i <= 15; i++) {
        if(roomss[i] == true){
          rooms.push(i);
        }
      }
      let name: string = f.value.name;
      let address: string = f.value.address;
      let province_id : number = parseInt(f.value.id_province);

      
      this.adminService.saveCinema(name,address,province_id,rooms).subscribe({
        next: data =>{
          this.save=data;
          console.log(data);
          document.getElementById("close")?.click();
        },
        error: err => {
          this.message = JSON.parse(err.error).message;
        }
      })
    }
    
    this.getCinema();
  }
 

  deleted(cinemaid:any){
    this.adminService.deleteCinema(cinemaid).subscribe({
      next:data =>{
        this.deleteds = data;
        console.log(data);
      }
    })
  }
  
}
