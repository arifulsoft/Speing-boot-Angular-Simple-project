import { Component, OnInit } from '@angular/core';
import { RegServiceService } from '../services/reg-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-data',
  templateUrl: './show-data.component.html',
  styleUrls: ['./show-data.component.css']
})
export class ShowDataComponent implements OnInit {

  fetchData: any
  constructor(private myservice: RegServiceService, private router: Router) {
    this.myservice.show().subscribe((x) => {
      this.fetchData = x
    });
  }

  data: any;

  username_3:any
  update(v: any) {
    this.username_3=v;
  
    this.myservice.search(v).subscribe((x) => {
      this.data = x;
      this.router.navigateByUrl("edit_user", { state: { response: this.data } });
    });
  }

  delete(v: any) {
    this.myservice.delete(v).subscribe(() => {
      alert("deleted")
      // this.data = x;
      // this.router.navigateByUrl("delete", { state: { response: this.data } });
    });
  }

  ngOnInit(): void {
  }


}
