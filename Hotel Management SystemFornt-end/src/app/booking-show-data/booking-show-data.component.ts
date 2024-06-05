import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';

@Component({
  selector: 'app-booking-show-data',
  templateUrl: './booking-show-data.component.html',
  styleUrls: ['./booking-show-data.component.css']
})
export class BookingShowDataComponent implements OnInit {
  customer_id:any;
  check: any;
  constructor(private myservice: BookingService ) { 
    

  }

  ngOnInit(): void {
    this.myservice.checkinout().subscribe((x) => { this.check = x });
  }
  getData:any;
  search(){
    this.myservice.gettabledata(this.customer_id).subscribe((x) => { 
      this.getData = x ;
    });
  }
}
