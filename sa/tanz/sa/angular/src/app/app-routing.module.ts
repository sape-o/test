import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
import { HomeComponent } from './home/home.component';
import { TenantinComponent } from './tenantin/tenantin.component';
import {  Routes } from '@angular/router';
import {RouterModule} from '@angular/router';


const routes: Routes = [
{ path: 'login', component: LoginComponent },
{ path: 'menu', component: MenuComponent },
{ path: 'home', component: HomeComponent },
{ path: 'tenantin', component: TenantinComponent},

{path: '',redirectTo: 'login', pathMatch: 'full'},

];

@NgModule({
  imports: [
    CommonModule,
 RouterModule.forRoot(routes),
  ],
  declarations: []
})
export class AppRoutingModule { }
