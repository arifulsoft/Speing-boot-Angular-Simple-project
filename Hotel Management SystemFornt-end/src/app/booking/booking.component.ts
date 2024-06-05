import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  booking: any;
  roomNo: any;
  checkin:any;
  checkout:any;

  feedback:any;
  //this.router.navigateByUrl("booking",{ state: { response:id,checkin: this.checkin, checkout: this.checkout}});
  constructor(private myservice: BookingService, private router: Router) {
    this.roomNo = this.router.getCurrentNavigation()?.extras.state?.["response"];
    this.checkin = this.router.getCurrentNavigation()?.extras.state?.["checkin"];
    this.checkout = this.router.getCurrentNavigation()?.extras.state?.["checkout"];
    this.myservice.feedbackshow().subscribe((x) => { this.feedback = x });

    this.myservice.roombyid(this.roomNo).subscribe((x)=>{this.booking=x});
    // if (this.id==null){
    //   alert("id null");
    // }else{
    //   alert(this.id);
    //   alert(this.booking.room_id);
    // }
  }
  ngOnInit(): void {
  }
  // m(){
  //   if (this.id==null){
  //     alert("id null");
  //   }else{
  //     alert(this.id);
  //     // alert(this.booking.room_id);
  //   }
  //   if(this.booking==null){
  //     alert("Booking Null")
  //   }else{
  //     alert("works")
  //   }
  // }

  form(){
    this.router.navigateByUrl("bookingform",{ state: { response:this.roomNo,checkin: this.checkin, checkout: this.checkout}});
  }
}
