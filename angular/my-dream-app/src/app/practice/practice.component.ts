import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

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
  public iceCream = ["vanilla","choclate","pista","strawberry"];


  @Input('parentData')
  public newLaptopName: any;

  @Output()
  public childEvent = new EventEmitter();

  
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

  fireEvent(){
    console.log("event triggered");
    this.childEvent.emit("hey, I'm from Dell  version 2.0");
  }


}
