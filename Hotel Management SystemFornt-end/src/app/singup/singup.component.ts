import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { User } from '../model/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-singup',
  templateUrl: './singup.component.html',
  styleUrls: ['./singup.component.css']
})
export class SingupComponent implements OnInit {
username:any;
email:any;
password:any;
role:any;

register:any;
  constructor(private myservice:BookingService,private router:Router) { }

  ngOnInit(): void {
  }
  singUp(){
    this.register=new User(this.username,this.email,this.password,this.role);
    this.myservice.singUp(this.register).subscribe(()=>{
      //this.myservice.getallstudents().subscribe((x)=>{this.allstudent=x});
      alert('Registration success');
    });
  }
}
