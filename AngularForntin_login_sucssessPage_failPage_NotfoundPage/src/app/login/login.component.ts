import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router,private myservice:ServiceService) { }

  ngOnInit(): void {
  }

  id: any;
  password: any;
  obj: any;
  p: any[] = [];

  m1() {
    this.p=this.myservice.getData().slice();
    this.obj = this.p.find(x => (x.id == this.id) && (x.password == this.password))
      if (this.obj != null) {
        this.myservice.data=this.obj;
       this.router.navigateByUrl("success");
      }else{
        this.router.navigateByUrl("fail");
      }
    }


    // dropdoun

    products=[
      {id:101,name:"Computer",stock:5,price:7000,image:"assets/image/c.jpg"},
      {id:102,name:"Monitor",stock:4,price:5000,image:"assets/image/m.jpg"},
      {id:103,name:"CPU",stock:8,price:9000,image:"assets/image/d.jpg"},
      {id:104,name:"Keyboard",stock:6,price:8000,image:"assets/image/k.jpg"},
      {id:105,name:"Mouse",stock:3,price:4000,image:"assets/image/e.jpg"},
    ];
    product:any={id:101,name:"Computer",stock:5,price:7000,image:"assets/image/abc.png"};
    m2(i:any){
      this.product=new Object();
      this.product.id=this.products[i].id;
      this.product.name=this.products[i].name;
      this.product.stock=this.products[i].stock;
      this.product.price=this.products[i].price;
      this.product.image=this.products[i].image;
    }
  }


