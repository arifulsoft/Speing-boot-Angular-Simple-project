import { Component, OnInit } from '@angular/core';
import { RegServiceService } from '../services/reg-service.service';
import { Router } from '@angular/router';
import { Registration } from '../classes/Registration';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {

  
  username: any;
  email: any;
  password: any;


  getData: any;
constructor(private myservice:RegServiceService,private router:Router){
this.getData=this.router.getCurrentNavigation()?.extras.state?.["response"];

this.username = this.getData.username;
this.email = this.getData.email;
this.password = this.getData.password;

}

  ngOnInit(): void {

  }
  


  // ------------------------------ update account---------------------------------

  update() {
    this.getData = new Registration(this.username, this.email, this.password);
    this.myservice.update(this.getData).subscribe(() => { });
    alert("Successfully Updated");
  }

}
