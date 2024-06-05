import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pre-room',
  templateUrl: './pre-room.component.html',
  styleUrls: ['./pre-room.component.css']
})
export class PreRoomComponent implements OnInit {
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
