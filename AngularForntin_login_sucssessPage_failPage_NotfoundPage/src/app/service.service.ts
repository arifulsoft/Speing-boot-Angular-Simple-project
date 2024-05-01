import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor() { }
  array:any=[
    {id:101,name:"Ariful",email:"arif@gmail.com",password:123},
    {id:102,name:"Raj",email:"arif@gmail.com",password:123},
    {id:103,name:"Topu",email:"arif@gmail.com",password:123},
    {id:104,name:"Sumon",email:"arif@gmail.com",password:123},
    {id:105,name:"Ebrahim",email:"arif@gmail.com",password:123}
  ]
  public getData(){
    return this.array
  }
  public data:any;
}
