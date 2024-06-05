import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Room } from '../model/room';
import { Customar } from '../model/customar';
import { Booking } from '../model/booking';
import { Payment } from '../model/payment';
import { User } from '../model/user';
import { RoomRent } from '../model/room-rent';
import { AdminLoging } from '../model/admin-loging';
import { Days } from '../model/days';
import { Foodtransaction } from '../model/foodtransaction';
import { Feedback } from '../model/feedback';
import { ShowData } from '../model/show-data';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  constructor(private http: HttpClient) { }
  url: any;
  // single-room-show--------------------------------
  room(): Observable<Room> {
    this.url = "http://localhost:8080/allroom";
    return this.http.get<Room>(this.url);
  }

  // room search -------------------------------

  roombyid(id: any): Observable<Room> {
    this.url = "http://localhost:8080/"
    return this.http.get<Room>(this.url+id);
  }

  // booking--------------------------------------
  bookingform(s:Customar):Observable<Customar>{
    this.url="http://localhost:8080/booking";
    return this.http.post<Customar>(this.url,s);
  }

  //---------------------check room available-------------------

  check(checkin:any,checkout:any):Observable<Room>{
    this.url="http://localhost:8080/checking/"+checkin+"/"+checkout;
    // alert("Controller");
    return this.http.get<Room>(this.url);
  }


  // booking-data-show-admin------------------------------- 
  getallbooking():Observable<Customar>{
    this.url="http://localhost:8080/bookingshow";
    return this.http.get<Customar>(this.url)
  }

   // get 3 table data------------------------------ 
   getalltabledata3(customer_id:any):Observable<ShowData>{
    this.url="http://localhost:8080/getalltabledata/";
    return this.http.get<ShowData>(this.url+customer_id);
  }
// food order data show table ------------------------------orderManu 
orderManu(customer_id:any):Observable<Foodtransaction>{
  this.url="http://localhost:8080/orderManu/";
  return this.http.get<Foodtransaction>(this.url+customer_id);
}



  // get table data------------------------------ 

  gettabledata(customer_id:any):Observable<Booking>{
    this.url="http://localhost:8080/gettabledata/";
    return this.http.get<Booking>(this.url+customer_id);
  }


   // feedbackshow-data-show-admin-------------------------------
   feedbackshow():Observable<Feedback>{
    this.url="http://localhost:8080/ac/feedbackshow";
    return this.http.get<Feedback>(this.url)
  }


  // payment-data-show-admin-------------------------------
  paymentshow():Observable<Payment>{
    this.url="http://localhost:8080/paymentshow";
    return this.http.get<Payment>(this.url)
  }

  
  // checkinout-data-show-admin-------------------------------
  checkinout():Observable<Booking>{
    this.url="http://localhost:8080/checkinout";
    return this.http.get<Booking>(this.url)
  }

  // payment--------------------------------------=======
  Payment(s:Payment):Observable<Payment>{
    this.url="http://localhost:8080/payment";
    return this.http.post<Payment>(this.url,s);
  }


  // booking--------------------------------------=======
  book(s:Booking):Observable<Booking>{
    this.url="http://localhost:8080/bookingtable";
    return this.http.post<Booking>(this.url,s);
  }

   // user table--------------------------------------=======
   user(s:User):Observable<User>{
    this.url="http://localhost:8080/User";
    return this.http.post<User>(this.url,s);
  }
//customar table-------------------------------------
  customar(s:Customar):Observable<Customar>{
    this.url="http://localhost:8080/customar";
    return this.http.post<Customar>(this.url,s);
}


// booking-data-show-admin-------------------------------
roomReantshow():Observable<RoomRent>{
  this.url="http://localhost:8080/reant";
  // alert(this.url)
  return this.http.get<RoomRent>(this.url)
}

// roomRentById

roomRentByRoomId(id:any):Observable<RoomRent>{
  this.url="http://localhost:8080/roomRentById/";
  return this.http.get<RoomRent>(this.url+id);

}

// customar-show---------------


customarsingle(id:any):Observable<Customar>{
  this.url="http://localhost:8080/bookingsingleId/";
  return this.http.get<Customar>(this.url+id);
}

// Admin-Loging-------------------------------------
loginByAdmin(username:any,password:any):Observable<AdminLoging>{
  this.url="http://localhost:8080/";
  return this.http.get<AdminLoging>(this.url+username+"/"+password);
}


// Register-----------------------------------------
singUp(s:User):Observable<User>{
  this.url="http://localhost:8080/singUp/new";
  return this.http.post<User>(this.url,s);
}

// order confirm-----------------------------------------

addorder(s:Foodtransaction):Observable<Foodtransaction>{
  this.url="http://localhost:8080/addorder";
  return this.http.post<Foodtransaction>(this.url,s);
}

// add amount in payment table--------------------------------------- 

addamount(c_id:any, amount:any):Observable<Payment>{
  this.url="http://localhost:8080/addamount/";
  return this.http.get<Payment>(this.url+c_id+"/"+amount);
}

//Day Calculation------------------------------

days(checkin:any,checkout:any):Observable<Booking>{
  // alert("service Work")
  this.url="http://localhost:8080/days/"+checkin+"/"+checkout;
  return this.http.get<Booking>(this.url);
}

paymentDays():Observable<Days>{
  this.url="http://localhost:8080/totaldays";
  return this.http.get<Days>(this.url);
}

// data query customer by nid or passport

customerByNid(passport:any,nid:any):Observable<Customar>{
  // alert("customer by nid service work")
  this.url="http://localhost:8080/passNid/"+passport+"/"+nid;
  return this.http.get<Customar>(this.url);
}


// FeedBack--------------------------------------
feedback(s:Feedback):Observable<Feedback>{
  this.url="http://localhost:8080/feedback";
  return this.http.post<Feedback>(this.url,s);
}

}