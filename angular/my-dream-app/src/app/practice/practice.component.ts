import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-practice',
  templateUrl: './practice.component.html',
  styleUrls: ['./practice.component.css']
})
export class PracticeComponent implements OnInit {

  public name = "spidy";
  carName = " hey it's a nano";

  constructor() { }

  ngOnInit(): void {
  }

  greetUser(){
    return " hey " +this.name;
  }

}
