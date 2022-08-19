import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PracticeComponent } from './practice/practice.component';
import { DepartmentComponent } from './department/department.component';
import { StudentComponent } from './student/student.component';
import { RouterModule } from '@angular/router';
@NgModule({
  declarations: [
    AppComponent,
    PracticeComponent,
    DepartmentComponent,
    StudentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot([
      {path: 'department', component: DepartmentComponent},
      {path: 'student-data', component: StudentComponent},
    ]),

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
