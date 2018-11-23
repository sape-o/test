import { Component, OnInit, Inject,ViewEncapsulation } from '@angular/core';
import { Router} from '@angular/router';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';
import { Observable } from "rxjs";
import { HttpClient} from '@angular/common/http';
import { MatTableModule } from '@angular/material';
@Component({
  selector: 'app-tenantin',
  templateUrl: './tenantin.component.html',
  styleUrls: ['./tenantin.component.css']
})
export class TenantinComponent implements OnInit {

  user : Array<any>;
  discal: string[] = ['name','phonenumber','idCardNumber','address', 'age','birthday','career','gender'];

  dataSource =this.user;


  constructor(

    private httpClient: HttpClient
    ) { }

    getUsers(): Observable<any> {
        return this.httpClient.get('http://localhost:8080/InformationPerson');
      }

  ngOnInit() {
    this.getUsers().subscribe(data => {
    this.user = data;
    this.dataSource =this.user;
    console.log("ok",this.dataSource);

  });


//  const myArrStr = JSON.stringify(datashow);
//  console.log(myArrStr);
  }

}
