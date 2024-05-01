import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RegServiceService } from '../services/reg-service.service';
import { Registration } from '../classes/Registration';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {

  constructor(private myservice:RegServiceService, private router: Router) { }

  username:any;
  email:any;
  password:any;
  searchUser:any;

  ngOnInit(): void {
  }

  update(){

    this.searchUser=new Registration(this.username,this.email,this.password)
    this.myservice.update(this.searchUser).subscribe((x)=>{
this.searchUser=x;

      // this.router.navigateByUrl("success",{state:{response:this.searchUser}})
this.email=this.searchUser.email;
this.password=this.searchUser.password;

    })
    alert("Successfully Updated");
    }

}

