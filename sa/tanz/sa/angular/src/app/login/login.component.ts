import { Component, OnInit, Inject,ViewEncapsulation } from '@angular/core';
import { Router} from '@angular/router';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';
import { FormBuilder, FormGroup, FormControl } from '@angular/forms';
import { Observable } from "rxjs";
import { HttpClient} from '@angular/common/http';
import { MatTableModule } from '@angular/material';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  Person: FormGroup;
  user : Array<any>;
  constructor(
    private httpClient:HttpClient,
    private fb:FormBuilder,
      private router:Router
  ) { }

  getUsers(): Observable<any> {
      return this.httpClient.get('http://localhost:8080/User');
    }
    getUsers2(): Observable<any> {
      // รับข้อมูล ทั้งหมด
        return this.httpClient.get('http://localhost:8080/InformationPerson');
      }
  ngOnInit() {
    this.Person = this.fb.group({

      email:new FormControl(null,[]),
      password:new FormControl(null,[])
    });

    this.getUsers().subscribe(data => {
    this.user = data;
    console.log("ok",this.user);

  });
  }
  login(){
    for(var i=0;i< this.user.length;i++ ){
      if(this.Person.value.email == this.user[i].id && this.Person.value.password == this.user[i].password){
        alert("ล็อกอิน ถูกต้อง");
        var j=1;
        this.router.navigate(['/home/'+(i+1)]);
        break;
      }

    }
    if(j!=1)alert("False");
    j=0;
  }
}
