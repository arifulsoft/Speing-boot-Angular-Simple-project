import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TopHeaderComponent } from './top-header/top-header.component';
import { FormsModule } from '@angular/forms';
import { CaroselComponent } from './carosel/carosel.component';
import { AboutPageComponent } from './about-page/about-page.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { RegistrationComponent } from './registration/registration.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { SearchComponent } from './search/search.component';
import { SuccessComponent } from './success/success.component';
import { FailComponent } from './fail/fail.component';
import { RegServiceService } from './services/reg-service.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ShowDataComponent } from './show-data/show-data.component';

import { DeleteComponent } from './delete/delete.component';
import { EditUserComponent } from './edit-user/edit-user.component';
@NgModule({
  declarations: [
    AppComponent,
    TopHeaderComponent,
    CaroselComponent,
    AboutPageComponent,
    FooterComponent,
    HomeComponent,
    RegistrationComponent,
    LoginComponent,
    SearchComponent,
    SuccessComponent,
    FailComponent,
  
    ShowDataComponent,

    DeleteComponent,
    EditUserComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,

    BrowserAnimationsModule
  ],
  providers: [RegServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
