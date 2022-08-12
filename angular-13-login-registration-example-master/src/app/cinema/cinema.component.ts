import { Component, OnInit } from '@angular/core';
import { Province } from '../_model/province';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-cinema',
  templateUrl: './cinema.component.html',
  styleUrls: ['./cinema.component.scss']
})
export class CinemaComponent implements OnInit {
  provinces:Province[] = [];
  province:any;
  constructor(private userService: UserService) { 
    this.getCinemaDefault();
  }

  ngOnInit(): void {
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

 

}
