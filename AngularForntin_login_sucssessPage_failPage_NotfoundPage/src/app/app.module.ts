import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FailComponent } from './fail/fail.component';
import { SuccessComponent } from './success/success.component';
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { ServiceService } from './service.service';
import { NotfoundComponent } from './notfound/notfound.component';


@NgModule({
  declarations: [
    AppComponent,
    FailComponent,
    SuccessComponent,
    LoginComponent,
    NotfoundComponent,
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
