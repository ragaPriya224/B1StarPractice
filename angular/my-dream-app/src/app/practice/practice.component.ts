import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-practice',
  templateUrl: './practice.component.html',
  styleUrls: ['./practice.component.css']
})
export class PracticeComponent implements OnInit {

  public name = "spidy";
  carName = " hey it's a nano";
  display = false;
  public color = "blue";

  constructor() { }

  ngOnInit(): void {
  }

  greetUser(){
    return " hey " +this.name;
  }

  onClick(event: any){
    console.log('**********************');
    console.log(event);
  }
}
