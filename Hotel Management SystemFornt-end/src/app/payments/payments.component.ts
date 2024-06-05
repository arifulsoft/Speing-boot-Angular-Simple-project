import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-payments',
  templateUrl: './payments.component.html',
  styleUrls: ['./payments.component.css']
})
export class PaymentsComponent implements OnInit {

  // id:any;
  //For Payment
  room_number: any;
  paymentcustomar_id: any;
  total_bill: any;
  pay: any;
  due: any;
  status: any;
  payment_type: any;
  transaction_id: any;
  //for booking
  checkin: any;
  checkout: any;
  bookingCustomerId: any;
  adult: any;
  child: any;

  //user table
  userid: any;
  password: any;
  role: any;

  //room Rent---------
  room_no: any;
  room_reant: any;
  service_bill: any;
  //customar table--------
  name: any;
  email: any;
  phone: any;
  passport: any;
  nid: any;
  customarRoomNumber: any;



  customer: any;
  roomReantShow: any
  roomReantData:any;

  //{ customer: this.bookingpart, roomId: this.room_number, checkin: this.checkin, checkout: this.checkout}
  constructor(private myservice: BookingService, private router: Router) {
    this.customer = this.router.getCurrentNavigation()?.extras.state?.["customer"];
    this.room_number = this.router.getCurrentNavigation()?.extras.state?.["roomId"];
    this.checkin = this.router.getCurrentNavigation()?.extras.state?.["checkin"];
    this.checkout = this.router.getCurrentNavigation()?.extras.state?.["checkout"];

    this.myservice.roomReantshow().subscribe((data:any) => {
      this.room_reant = data;

    })


    this.myservice.roomReantshow().subscribe(
      (data:any)=>{
        this.roomReantData=data;
      }
    )
  }

  ngOnInit(): void {
  }

}
