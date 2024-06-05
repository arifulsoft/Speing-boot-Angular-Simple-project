import { Component, OnInit } from '@angular/core';
import { BookingService } from '../service/booking.service';
import { Router } from '@angular/router';
import { Payment } from '../model/payment';
import { Booking } from '../model/booking';
import { User } from '../model/user';
import { Customar } from '../model/customar';

@Component({
  selector: 'app-payments2',
  templateUrl: './payments2.component.html',
  styleUrls: ['./payments2.component.css']
})
export class Payments2Component implements OnInit {



  ngOnInit(): void {
  }


  previouCustomer:any=false;
  id:any;
  payments:any;
  //For Payment
  room_number: any;
  customar_id: any;
  total_bill: any;
  pay: any=0;
  due: any;
  status: any;
  bookingstatus:any="not check in";
  payment_type: any;
  transaction_id: any;

   payment(){
    this.total_bill=((this.roomRentByDataId.room_reant)*this.totalDays + this.roomRentByDataId.service_bill);
    this.due=this.total_bill-this.pay;
    if(this.pay!=0 && this.due!=0){
      this.status="partial paid";
    }else if(this.pay==0 ){
      this.status="due";
    }else if(this.pay!=0 && this.due==0){
      this.status="paid";
    }
    this.payments=new Payment(this.id,this.room_number,this.customar_id,this.total_bill,this.pay,this.due,this.status,this.payment_type,this.transaction_id);
      }

  booking:any;
  //for booking
  checkin: any;
  checkout: any;
  adult: any;
  child: any;

bookingCustomar(){
this.booking=new Booking(this.checkin,this.checkout,this.room_number,this.customar_id,this.adult,this.child,this.bookingstatus);
}

  totalDays:any;

  user:any;
  //user table
  username: any;
  email:any;
  password: any;
  role: any;
  // constructor(username: any, email:any, password: any, role: any) {

  newUser(){
    this.user=new User(this.username,this.email,this.password,this.role)
  }

  //room Rent---------
  room_no: any;
  room_reant: any;
  service_bill: any;


  customerTable:any;
  //customar table--------
  name: any;
  
  phone: any;
  passport: any;
  nid: any;
  customarRoomNumber: any;
// customar(){
//   this.customerTable=new Customar(this.customar_id,this.name,this.email,this.phone,this.passport,this.nid,this.room_number);
// }


  bookingpart:any;

  customer: any;
  roomReantShow: any
  roomReantData:any;

  roomRentByDataId:any
  customarsingle:any;

  newCustomer:any;
 
  constructor(private myservice: BookingService, private router: Router) {

    this.customer = this.router.getCurrentNavigation()?.extras.state?.["customer"];
    this.room_number = this.router.getCurrentNavigation()?.extras.state?.["roomId"];
    this.checkin = this.router.getCurrentNavigation()?.extras.state?.["checkin"];
    this.checkout = this.router.getCurrentNavigation()?.extras.state?.["checkout"];
    this.adult = this.router.getCurrentNavigation()?.extras.state?.["adult"];
    this.child = this.router.getCurrentNavigation()?.extras.state?.["child"];
    this.name=this.customer.name;
    this.passport=this.customer.passport;
    this.nid=this.customer.nid;
    // this.myservice.bookingform(this.bookingpart).subscribe(() => {

    //   alert("Booking Success")
    // });

  //   this.myservice.roomReantshow().subscribe((data:any) => {
  //     alert("constructor")
  //     this.room_reant = data;

  //   },
  // (error)=>{
  //   alert("no data")
  // })

  // reant----------------
  this.myservice.roomRentByRoomId(this.room_number).subscribe(
    (data:any)=>{
      // alert(this.room_number)
      this.roomRentByDataId=data;
    }
  )

  // customar-show-----------------
  // this.myservice.customarsingle(this.room_number).subscribe(
  //   (data:any)=>{
  //     // alert(this.room_number)
  //     this.customarsingle=data;
    // }
  // )

//  this.myservice.paymentDays().subscribe((x)=>{
//   this.totalDays=x.totalDays;
//   this.checkin=x.checkIn;
//   this.checkout=x.checkOut
//  })

  let checkInDate= new Date(this.checkin);
  let checkOutDate= new Date(this.checkout);
  this.totalDays= Math.floor((Date.UTC(checkOutDate.getFullYear(),checkOutDate.getMonth(),checkOutDate.getDate())-Date.UTC(checkInDate.getFullYear(),checkInDate.getMonth(),checkInDate.getDate()))/(1000 * 60 * 60 * 24))
    
  }
  procitToPayment(){
    this.myservice.bookingform(this.customer).subscribe(() => {
      alert("Booking Success");
      if(this.passport!=null || this.nid!=null){
        this.myservice.customerByNid(this.passport,this.nid).subscribe((x)=>{
          // alert("customer query");
          this.newCustomer=x;
          this.customar_id=this.newCustomer.customar_id;
          // alert(this.customar_id);

          //--------------booking--------------------
          this.payment();
          this.bookingCustomar();
          this.myservice.book(this.booking).subscribe(()=>{
            // alert("Room Booking Confirm");
          });

          //-------------------payments---------------------
          this.myservice.Payment(this.payments).subscribe(()=>{
            // alert("Payments Complete");
          })

        })
      }
    });
  }
  print(){
    window.print()
  }

}
