import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';

@Component({
  selector: 'app-show-data',
  templateUrl: './show-data.component.html',
  styleUrls: ['./show-data.component.css']
})
export class ShowDataComponent implements OnInit {
  customer_id: any;
  constructor(private myservice: BookingService) {

  }

  ngOnInit(): void {
  }

  getData: any;
  search() {
    this.myservice.getalltabledata3(this.customer_id).subscribe((x) => {
      this.getData = x;
      // alert("successful");
    });
  }

  CheckOut(){
    alert("CheckOut success")
  }
}
