import { Component, OnInit } from '@angular/core';
import {SelectionModel} from '@angular/cdk/collections';
import {MatTableDataSource} from '@angular/material';
import {Router} from '@angular/router';
import { ActivatedRoute } from '@angular/router';
import { map, filter } from 'rxjs/operators';
import { HttpClient} from '@angular/common/http';

import { Observable } from "rxjs";


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {
  sub:any;

  id: number;
  state:number;

  user : Array<any>;
  discal: string[] = ['name','phonenumber','idCardNumber','address', 'age','birthday','career','gender'];

  dataSource ;

  constructor(
    private httpClient:HttpClient,
    private rout: ActivatedRoute
    ) { }


    getInformation(id): Observable<any> {
      return this.httpClient.get("http://localhost:8080/InformationPerson/" + id);
    }
  ngOnInit() {
    this.sub = this.rout.params.subscribe(params => {
      this.id = +params['id'];
      console.log("This.id=="+this.id);
    });
    this.getInformation(this.id).subscribe(data => {
      this.user = data;
      this.dataSource =this.user;
      console.log("This.user==",this.user);
    });



  }
}
