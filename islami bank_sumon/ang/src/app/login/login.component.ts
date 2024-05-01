import { Component, OnInit } from '@angular/core';
import { RegServiceService } from '../services/reg-service.service';
import { Login } from '../classes/login';
import { ActivatedRoute, Router } from '@angular/router';
import { state } from '@angular/animations';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private myservice: RegServiceService,private router:Router) { }

  ngOnInit(): void {
  }
  username: any;
  password: any;
  loginUser:any;

  login() {
    
    this.myservice.loginByUsername(this.username,this.password).subscribe((x)=>{
      this.loginUser=x;
      if(this.loginUser!=null){
        this.router.navigateByUrl("success",{state:{response: this.loginUser}})
      }else{
        alert("User Id and Password mismatch")
      }
    });
  }
  
}



