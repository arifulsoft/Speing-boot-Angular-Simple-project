import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  username:any;
  password:any;
  loginUser: any;
  constructor(private myservice: BookingService, private router: Router) {
  }


  ngOnInit(): void {
  }

 
  login(){

    this.myservice.loginByAdmin(this.username, this.password).subscribe((x) => {
      this.loginUser = x;
   
      if ((this.loginUser != null && this.loginUser.role == 'admin')) {
        this.router.navigateByUrl("admin-welcome-page", { state: { response: this.loginUser } });
      } 
      else if ((this.loginUser != null) && this.loginUser.role == 'customar') {
        this.router.navigateByUrl("customar-login-page", { state: { response: this.loginUser } });
      } 
      else {
        // this.router.navigateByUrl("error");
        // alert("Wrong Password!Please Enter Correct Password");
    }

      }); 

  }

}

