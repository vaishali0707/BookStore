import { Component, OnInit } from '@angular/core';
import { ManageUserService } from '../manage-user.service';

@Component({
  selector: 'app-manage-user',
  templateUrl: './manage-user.component.html',
  styleUrls: ['./manage-user.component.css']
})
export class ManageUserComponent implements OnInit {

  showModal=false;
  adminId:any=453;

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
  deleteUser()
  {
    this._manageService.deleteUser(this.adminId).subscribe(
      data=>{
        console.log(data);
      }
    )
  }
}
