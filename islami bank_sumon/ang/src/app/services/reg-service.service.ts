import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Registration } from '../classes/Registration';
import { Observable } from 'rxjs';
import { Login } from '../classes/login';
@Injectable({
  providedIn: 'root'
})
export class RegServiceService {

  constructor(private http:HttpClient) {

   }
   
   url:any;


//this method is for insert data
  save(s:Registration):Observable<Registration>{
    this.url="http://localhost:8080/save";
    return this.http.post<Registration>(this.url,s);
  }


  //------------------showing data---------------
  getallstudents():Observable<Registration>{
    this.url="http://localhost:8080/all";
    return this.http.get<Registration>(this.url);
  }

//----------------------user login data----------------------
  loginByUsername(username:any,password:any):Observable<Registration>{
    
    this.url="http://localhost:8080/";
    return this.http.get<Registration>(this.url+username+"/"+password);
  }

  //search by username
  search(username:any):Observable<Registration>{
    
    this.url="http://localhost:8080/";
    return this.http.get<Registration>(this.url+username);
  }


//------update----------
update(s:Registration):Observable<Registration>{
  this.url="http://localhost:8080/update";
  return this.http.put<Registration>(this.url,s);

}

//--------------delete----------
delete(s:any):Observable<Registration>{
  this.url="http://localhost:8080/delete/";
  return this.http.delete<Registration>(this.url+s);

}

//show all data

show():Observable<Registration>{
  this.url="http://localhost:8080/show";
  return this.http.get<Registration>(this.url);
}


}
