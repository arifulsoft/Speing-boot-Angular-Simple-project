import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-admin-welcome-page',
  templateUrl: './admin-welcome-page.component.html',
  styleUrls: ['./admin-welcome-page.component.css']
})
export class AdminWelcomePageComponent implements OnInit {
adminUser:any;
  constructor(private router:Router,private route:ActivatedRoute) { 
    this.adminUser=this.router.getCurrentNavigation()?.extras.state?.["response"];
  }
  ngOnInit(): void {
  }
}
