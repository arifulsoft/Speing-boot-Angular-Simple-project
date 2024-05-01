import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SuccessComponent } from './success/success.component';
import { FailComponent } from './fail/fail.component';
import { NotfoundComponent } from './notfound/notfound.component';


const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'success',component:SuccessComponent},
  {path:'fail',component:FailComponent},
  {path:'**',component:NotfoundComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
