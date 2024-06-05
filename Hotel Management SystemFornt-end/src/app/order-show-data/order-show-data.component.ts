import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';

@Component({
  selector: 'app-order-show-data',
  templateUrl: './order-show-data.component.html',
  styleUrls: ['./order-show-data.component.css']
})
export class OrderShowDataComponent implements OnInit {
  customer_id:any
  constructor(private myservice: BookingService) { }

  ngOnInit(): void {
  }
  getData:any;
  search(){
    this.myservice.orderManu(this.customer_id).subscribe((x) => { 
      this.getData = x ;
    });
  }
}
