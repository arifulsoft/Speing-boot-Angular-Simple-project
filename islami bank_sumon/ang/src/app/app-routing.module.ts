import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TopHeaderComponent } from './top-header/top-header.component';
import { AboutPageComponent } from './about-page/about-page.component';
import { CaroselComponent } from './carosel/carosel.component';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SearchComponent } from './search/search.component';
import { SuccessComponent } from './success/success.component';
import { FailComponent } from './fail/fail.component';
import { ShowDataComponent } from './show-data/show-data.component';
import { DeleteComponent } from './delete/delete.component';

import { EditUserComponent } from './edit-user/edit-user.component';



const routes: Routes = [
  { path: '', component: HomeComponent }, // Default route
  { path: 'TopHeaderComponent', component: TopHeaderComponent },
  { path: 'CaroselComponent', component: CaroselComponent },
  { path: 'AboutPageComponent', component: AboutPageComponent },
  { path: 'Registration', component: RegistrationComponent },
  { path: 'Login', component: LoginComponent },
  { path: 'success', component: SuccessComponent },
  { path: 'fail', component:FailComponent },
  { path: 'search', component:SearchComponent },
  { path: 'showData', component:ShowDataComponent },

  {
    path:"edit_user",
    component:EditUserComponent
  },
  { path: 'delete', component:DeleteComponent }







  


  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
