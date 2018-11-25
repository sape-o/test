import {InformationPerson} from './InforModel';
import { Injectable } from '@angular/core';
import { HttpClient
} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class RentService{
    public informationPerson:InformationPerson;
    constructor(private http: HttpClient)
    {
        this.informationPerson = new InformationPerson();
    }

    getmenu(name:string,gender:string,idCardNumber:string,address:string,date:Date,PhoneNumber:string,email:string,password:string,age:number,career:string): Observable<any> {
        return this.http.get("//localhost:8080/InformationPerson/"+name+"/"+gender+"/"+idCardNumber+"/"+address+"/"+date+"/"+PhoneNumber+"/"+email+"/"+password+"/"+age+"/"+career);
      }

    getInformation(id): Observable<any> {
      return this.http.get("http://localhost:8080/InformationPerson/" + id);
    }
}
