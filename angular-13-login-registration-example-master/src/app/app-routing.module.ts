import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { BoardUserComponent } from './board-user/board-user.component';
import { BoardModeratorComponent } from './board-moderator/board-moderator.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { CinemaComponent } from './cinema/cinema.component';
import { AdminCinemaComponent } from './admin-cinema/admin-cinema.component';
import { MovieDetailComponent } from './movie-detail/movie-detail.component';
import { BookingComponent } from './booking/booking.component';
import { TicketComponent } from './ticket/ticket.component';
import { AdminMovieComponent } from './admin-movie/admin-movie.component';
import { AdminMovieShowingComponent } from './admin-movie-showing/admin-movie-showing.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'user', component: BoardUserComponent },
  { path: 'mod', component: BoardModeratorComponent },
  { path: 'admin', component: BoardAdminComponent },
  { path: 'cinema', component: CinemaComponent },
  { path: 'admin-movie', component: AdminMovieComponent },
  { path: 'admin-cinema', component: AdminCinemaComponent },
  { path: 'admin-movie-showing', component: AdminMovieShowingComponent },
  { path: 'movie-detail/:id', component: MovieDetailComponent },
  { path: 'ticket', component: TicketComponent },
  { path: 'booking', component: BookingComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
