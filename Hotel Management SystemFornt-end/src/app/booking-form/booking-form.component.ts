import { Component, OnInit } from '@angular/core';
import { Booking } from '../model/booking';
import { BookingService } from '../service/booking.service';
import { Customar } from '../model/customar';
import { Router } from '@angular/router';
import { state } from '@angular/animations';

@Component({
  selector: 'app-booking-form',
  templateUrl: './booking-form.component.html',
  styleUrls: ['./booking-form.component.css']
})
export class BookingFormComponent implements OnInit {
  customar_id: any;
  name: any;
  email: any;
  phone: any;
  adulat:any;
  child:any;
  passport: any;
  nid: any;
  room_number: any;
  bookingpart: any;

  paymentDocument:any;
  
  checkin:any;
  checkout:any;
  alldata:any=[];
  //{ response:this.roomNo,checkin: this.checkin, checkout: this.checkout}
  // data:any;
  constructor(private myservice: BookingService, private router: Router) {
    this.room_number = this.router.getCurrentNavigation()?.extras.state?.["response"];
    this.checkin = this.router.getCurrentNavigation()?.extras.state?.["checkin"];
    this.checkout = this.router.getCurrentNavigation()?.extras.state?.["checkout"];
    // this.room_number=this.data;
  }

  ngOnInit(): void {
  }

  bookingform() {
    this.bookingpart = new Customar( this.customar_id,this.name, this.email,this.phone, this.passport, this.nid, this.room_number);
    
    this.router.navigateByUrl("/payment", { state: { customer: this.bookingpart, roomId: this.room_number, checkin: this.checkin, checkout: this.checkout,adult:this.adulat,child:this.child} });


  }
}
