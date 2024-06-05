import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-booking-show',
  templateUrl: './booking-show.component.html',
  styleUrls: ['./booking-show.component.css']
})
export class BookingShowComponent implements OnInit {


  payment: any;
  booking: any;


  constructor(private myservice: BookingService, private router: Router) {
    this.myservice.getallbooking().subscribe((x) => { this.booking = x });
    this.myservice.paymentshow().subscribe((x) => { this.payment = x });

  }

  ngOnInit(): void {
  }

}
