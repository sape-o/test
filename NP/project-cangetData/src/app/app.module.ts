import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {MatCardModule} from '@angular/material/card';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './/app-routing.module';
import { NavigationComponent } from './page/manu/navigation/navigation.component';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import { AngularFireModule } from 'angularfire2';
import { AngularFireAuthModule } from 'angularfire2/auth';
import { AngularFireDatabase, AngularFireObject } from 'angularfire2/database';
import { AngularFirestoreModule } from 'angularfire2/firestore';
import { environment} from '../environments/environment';
import { AuthService } from './services/services/auth.service';
import { AuthGuard } from './services/guards/auth.guard';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpModule } from '@angular/http';
import {MatStepperModule} from '@angular/material/stepper';
import {MatDatepickerModule,} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatIconModule} from '@angular/material/icon';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatListModule} from '@angular/material/list';
import {MatBadgeModule} from '@angular/material/badge';
import {MatMenuModule} from '@angular/material/menu';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatSelectModule} from '@angular/material/select';
import { OrderCustomerComponent } from './page/manu/order-customer/order-customer.component';
import { SignupComponent } from './page/login/signup/signup.component';
import { RegisterComponent } from './page/login/register/register.component';
import { PaymentComponent } from './page/manu/payment/payment.component';
import { SelecteRestaurantComponent } from './page/login/selecte-restaurant/selecte-restaurant.component';
import { RegisterRestaurantComponent } from './page/login/register-restaurant/register-restaurant.component';
import { LoginComponent } from './page/login/login/login.component';
import { AngularFireStorageModule } from 'angularfire2/storage';


import { AngularFireDatabaseModule } from 'angularfire2/database'
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NavigationComponent,
    SignupComponent,
    RegisterComponent,
    PaymentComponent,
    SelecteRestaurantComponent,
    RegisterRestaurantComponent,
    OrderCustomerComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatSidenavModule,
    MatCardModule,
    MatInputModule,
    MatButtonModule,
    AngularFireModule.initializeApp(environment.firebase),
    AngularFireAuthModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    AngularFirestoreModule,
    HttpModule,
    MatStepperModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatIconModule,
    MatToolbarModule,
    MatListModule,
    MatBadgeModule,
    MatMenuModule,
    MatCheckboxModule,
    MatSelectModule,
    AngularFireStorageModule,
    MatButtonToggleModule,
    AngularFireDatabaseModule
    
    
  ],
  providers: [AuthService, AngularFireDatabase, AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
