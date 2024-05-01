import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegServiceService } from '../services/reg-service.service';
import { Registration } from '../classes/Registration';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  constructor(private myservice: RegServiceService) { }

  ngOnInit(): void {

  }

  username:any;
  email:any;
  password:any;

  adminstaf11: any;
  userSearch() {
  this.myservice.search(this.username).subscribe((x) => {
    this.adminstaf11 = x;

    
    this.username=this.adminstaf11.username;
    this.email=this.adminstaf11.email;
    this.password=this.adminstaf11.password;


  
  });
}
// ------------------------------ update account // ---------------------------------

update() {
  this.adminstaf11 =new Registration( this.username, this.email, this.password);
  this.myservice.update(this.adminstaf11).subscribe(() => {
    alert("Hllel")
    
    }); 

  };
 
}


