import { Component, OnInit } from '@angular/core';
import { AuthService } from '../_services/auth.service';
import { TokenStorageService } from '../_services/token-storage.service';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent implements OnInit {
  isLoggedIn = false;
  username?: string;
  roles: string[] = [];

  tickets:any[]=[]

  constructor(private userService: UserService,private tokenStorageService: TokenStorageService, private authService: AuthService) {
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
    this.getTicket(this.username);
  }
  getTicket(username:any){
    this.userService.getTicket(username).subscribe({
      next:data =>{
        this.tickets=data;
        console.log(data)
      }
    })
  }

}
