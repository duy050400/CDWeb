import { Component, OnInit } from '@angular/core'
import { from, of, zip } from 'rxjs';
import { groupBy, mergeMap, toArray } from 'rxjs/operators';




@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    const people = [
      { name: 'Sue', age: 25 },
      { name: 'Joe', age: 30 },
      { name: 'Frank', age: 25 },
      { name: 'Sarah', age: 35 }
    ];
    //emit each person
    from(people)
  .pipe(
    groupBy(
      person => person.age,
      p => p.name
    ),
    mergeMap(group => zip(of(group.key), group.pipe(toArray())))
  )
  .subscribe(console.log);

  
  }
  

}
