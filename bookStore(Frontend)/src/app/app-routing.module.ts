import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ManageUserComponent } from './manage-user/manage-user.component';
import { ManageCustomerComponent } from './manage-customer/manage-customer.component';

const routes: Routes = [
  // {path:'/deleteUser',component:ManageUserComponent},
  // {path:'/deleteCustomer',component:ManageCustomerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
