import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NevbarComponent } from './nevbar/nevbar.component';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { BookingService } from './service/booking.service';
import { HttpClientModule } from  '@angular/common/http';
import { FooterComponent } from './footer/footer.component';
import { BookingComponent } from './booking/booking.component';
import { SidbarComponent } from './sidbar/sidbar.component';
import { BookingFormComponent } from './booking-form/booking-form.component';
import { SmallNavberComponent } from './small-navber/small-navber.component';
import { BookingShowComponent } from './booking-show/booking-show.component';
import { FabulousComponent } from './fabulous/fabulous.component';
import { Payments2Component } from './payments2/payments2.component';
import { Footer2Component } from './footer2/footer2.component';
import { PreBookingComponent } from './pre-booking/pre-booking.component';
import { PreRoomComponent } from './pre-room/pre-room.component';
import { AdminWelcomePageComponent } from './admin-welcome-page/admin-welcome-page.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { CustomarLoginPageComponent } from './customar-login-page/customar-login-page.component';
import { ErrorComponent } from './error/error.component';
import { SingupComponent } from './singup/singup.component';
import { FoodorderComponent } from './foodorder/foodorder.component';
import { FoodviewComponent } from './foodview/foodview.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { ShowDataComponent } from './show-data/show-data.component';
import { BookingShowDataComponent } from './booking-show-data/booking-show-data.component';
import { CheckinoutComponent } from './checkinout/checkinout.component';
import { OrderShowDataComponent } from './order-show-data/order-show-data.component';

@NgModule({
  declarations: [
    AppComponent,
    NevbarComponent,
    HomeComponent,
    FooterComponent,
    BookingComponent,
    SidbarComponent,
    BookingFormComponent,
    SmallNavberComponent,
    BookingShowComponent, 
    FabulousComponent,
    Payments2Component,
    Footer2Component,
    PreBookingComponent,
    PreRoomComponent,
    AdminWelcomePageComponent,
    AdminLoginComponent,
    CustomarLoginPageComponent,
    ErrorComponent,
    SingupComponent,
    FoodorderComponent,
    FoodviewComponent,
    FeedbackComponent,
    ShowDataComponent,
    BookingShowDataComponent,
    CheckinoutComponent,
    OrderShowDataComponent,
   
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [BookingService],
  bootstrap: [AppComponent]
})
export class AppModule { }
