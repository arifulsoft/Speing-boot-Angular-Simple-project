import { Component, OnInit } from '@angular/core';
import { RegServiceService } from '../services/reg-service.service';
import { Registration } from '../classes/Registration';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {


  username: any;
  email: any;
  password: any;

  registration: any;


  data:any

  constructor(private myservice: RegServiceService) { }

  ngOnInit(): void {
  }

  save() {
    this.registration = new Registration(this.username, this.email, this.password);
    this.myservice.save(this.registration).subscribe((data:any) => {
      this.data=data;

      //this.myservice.getallstudents().subscribe((x)=>{this.allstudent=x});
alert('Registration is successful');
    });
  }
}
