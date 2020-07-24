import { Component, OnInit } from '@angular/core';
import { ManageUserService } from '../manage-user.service';

@Component({
  selector: 'app-manage-customer',
  templateUrl: './manage-customer.component.html',
  styleUrls: ['./manage-customer.component.css']
})
export class ManageCustomerComponent implements OnInit {

  showModal=false;
  email:any="customer4@capgemini.com";

  constructor(private _manageService:ManageUserService) { }

  ngOnInit(): void {
  }

  openDialog()
  {
    this.showModal=true;

  }
  closeDialog()
  {
    this.showModal=false;
  }
  deleteCustomer()
  {
    this._manageService.deleteCustomer(this.email).subscribe(
      data=>{
        console.log(data);
      },
      error=>{
       alert(error.error);
       this.showModal=false;
      }
    )
  }

}
