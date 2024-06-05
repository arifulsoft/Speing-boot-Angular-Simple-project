import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { NevbarComponent } from './nevbar/nevbar.component';
import { SidbarComponent } from './sidbar/sidbar.component';
import { BookingComponent } from './booking/booking.component';
import { BookingFormComponent } from './booking-form/booking-form.component';
import { SmallNavberComponent } from './small-navber/small-navber.component';
import { BookingShowComponent } from './booking-show/booking-show.component';
import { FabulousComponent } from './fabulous/fabulous.component';
import { FooterComponent } from './footer/footer.component';
import { Payments2Component } from './payments2/payments2.component';
import { Footer2Component } from './footer2/footer2.component';
import { PreBookingComponent } from './pre-booking/pre-booking.component';
import { PreRoomComponent } from './pre-room/pre-room.component';
import { AdminWelcomePageComponent } from './admin-welcome-page/admin-welcome-page.component';
import { CustomarLoginPageComponent } from './customar-login-page/customar-login-page.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { SingupComponent } from './singup/singup.component';
import { FoodorderComponent } from './foodorder/foodorder.component';
import { FoodviewComponent } from './foodview/foodview.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { BookingShowDataComponent } from './booking-show-data/booking-show-data.component';
import { CheckinoutComponent } from './checkinout/checkinout.component';
import { ShowDataComponent } from './show-data/show-data.component';
import { OrderShowDataComponent } from './order-show-data/order-show-data.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'nevbar',component:NevbarComponent},
  {path:'pre-booking',component:PreBookingComponent},
  {path:'sidbar',component:SidbarComponent},
  {path:'booking',component:BookingComponent},
  {path:'bookingform',component:BookingFormComponent},
  {path:'small-navber',component:SmallNavberComponent},
  {path:'booking-show',component:BookingShowComponent},
  {path:'payment',component:Payments2Component},
  {path:'fabulous',component:FabulousComponent},
  {path:'footer',component:FooterComponent},
  {path:'footer2',component:Footer2Component},
  {path:'pre-room',component:PreRoomComponent},
  {path:'admin-welcome-page',component:AdminWelcomePageComponent},
  {path:'customar-login-page',component:CustomarLoginPageComponent},
  {path:'admin-login',component:AdminLoginComponent},
  {path:'singup',component:SingupComponent},
  {path:'foodorder',component:FoodorderComponent},
  {path:'foodview',component:FoodviewComponent},
  {path:'feedback',component:FeedbackComponent},
  {path:'booking-show-data',component:BookingShowDataComponent},
  {path:'checkinout',component:CheckinoutComponent},
  {path:'showalltabledata',component:ShowDataComponent},
  {path:'order-show-data',component:OrderShowDataComponent},


 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
