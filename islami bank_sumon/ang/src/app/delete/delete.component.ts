import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegServiceService } from '../services/reg-service.service';
import { Registration } from '../classes/Registration';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

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
  


  // ------------------------------ delete account---------------------------------

  delete() {
    this.getData = new Registration(this.username, this.email, this.password);
    this.myservice.delete(this.getData).subscribe(() => { });
    alert("Successfully Updated");
  }

}
