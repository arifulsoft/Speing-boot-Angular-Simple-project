import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-customar-login-page',
  templateUrl: './customar-login-page.component.html',
  styleUrls: ['./customar-login-page.component.css']
})
export class CustomarLoginPageComponent implements OnInit {

  adminUser:any;
  constructor(private router:Router,private route:ActivatedRoute) { 
    this.adminUser=this.router.getCurrentNavigation()?.extras.state?.["response"];
  }

  ngOnInit(): void {
  }

}
