import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-nevbar',
  templateUrl: './nevbar.component.html',
  styleUrls: ['./nevbar.component.css']
})
export class NevbarComponent implements OnInit {

  constructor(private myservice: BookingService, private router: Router) { }

  ngOnInit(): void {
  }
  checkin: any;
  checkout: any;
  room_no: any;
  customar_id: any;
  adulat: any;
  child: any;
  rooms: any = [];

  check(){
    this.myservice.check(this.checkin,this.checkout).subscribe((x)=>{
      // alert("checked");
      // alert("check in date => "+this.checkin);
      // alert("checkout in date => "+this.checkout);
      this.rooms=x;
      this.router.navigateByUrl("pre-booking", { state: { checkin: this.checkin, checkout: this.checkout} });
    })
    // alert("Try to work")
    // this.myservice.days(this.checkin,this.checkout).subscribe(()=>{
    //   alert("subscribe work")
    //   this.router.navigateByUrl("pre-booking");
    // })
  }

  check1() {
    this.router.navigateByUrl("pre-booking", { state: { response: this.rooms } });
  }

}




