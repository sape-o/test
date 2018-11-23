import { Injectable } from '@angular/core';
import 'rxjs/add/operator/map';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class DataService {

 constructor(private http: HttpClient) {
 }
 getCouses(lastname,address,tel,email) {
  //  return this.http.get('https://sutapi.xyz/getcourse/' + coursecode)
   return this.http.get('http://localhost:8080/employee/rtt/45kk/'+lastname+'/รหัสประชาชน/'+address+'/'+tel+'/122539/'+email+'/student/20' )
   .map(res => res);
 }
}