import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ManageUserService {

  _deleteUserUrl='http://localhost:8084/admin/deleteUser/';
  _deleteCustomerUrl='http://localhost:8084/admin/deleteCustomer/';

  constructor(private _http:HttpClient) { }

  deleteUser(deleteUser:any)
  {
    return this._http.delete<any>(this._deleteUserUrl+deleteUser);
  }
  deleteCustomer(deleteCustomer:any)
  {
    return this._http.delete<any>(this._deleteCustomerUrl+deleteCustomer);
  }
}
