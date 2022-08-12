import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminMovieShowingComponent } from './admin-movie-showing.component';

describe('AdminMovieShowingComponent', () => {
  let component: AdminMovieShowingComponent;
  let fixture: ComponentFixture<AdminMovieShowingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminMovieShowingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminMovieShowingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
