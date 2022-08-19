import { Component, OnInit } from '@angular/core';

@Component({
  selector: '[app-practice]',
  template: '<div>inline works<div>', 
  // templateUrl: './practice.component.html',
  styleUrls: ['./practice.component.css']
})
export class PracticeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
