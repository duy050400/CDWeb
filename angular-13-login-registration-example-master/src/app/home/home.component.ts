import { Component, OnInit } from '@angular/core';
import { Movie } from '../_model/movie';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  content: Movie[] = [];

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.userService.getMovie().subscribe({
      next: data => {
        this.content = data;
      },
      error: err => {
        this.content = JSON.parse(err.error).message;
      }
    });
    console.log(this.content)
    console.log("movie:")
    
  
  }
}
