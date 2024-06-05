import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Room } from '../model/room';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pry-booking',
  templateUrl: './pry-booking.component.html',
  styleUrls: ['./pry-booking.component.css']
})
export class PryBookingComponent implements OnInit {

  getalldata:any=[];
  // id:any;
  checkin:any;
  checkout:any;
  constructor(private myservice:BookingService, private router:Router) {
    this.checkin=this.router.getCurrentNavigation()?.extras.state?.["checkin"];
    this.checkout=this.router.getCurrentNavigation()?.extras.state?.["checkout"];
    this.myservice.room().subscribe(
      
      (x) => {this.getalldata=x});


      // alert(this.getalldata);
   }



  ngOnInit(): void {
  }
  single(id:any){
    // alert(id);
this.router.navigateByUrl("booking",{ state: { response:id,checkin: this.checkin, checkout: this.checkout}});
  }
}
