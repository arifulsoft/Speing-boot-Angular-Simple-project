import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Feedback } from '../model/feedback';
import { animate } from '@angular/animations';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {

  constructor(private myservice:BookingService) { }

  ngOnInit(): void {
  }
id:any;
name:any;
email:any;
massage:any;


feedbackData:any;


feedback(){
  this.feedbackData=new Feedback(this.id,this.name,this.email,this.massage);
  this.myservice.feedback(this.feedbackData).subscribe(()=>{
    alert('Feedback success');
  });
}

}
