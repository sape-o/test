import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl } from '@angular/forms';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { MatDialogRef } from '@angular/material';
import {Router} from '@angular/router'
@Component({
  selector: 'app-emregis',
  templateUrl: './emregis.component.html',
  styleUrls: ['./emregis.component.css']
})
export class EmregisComponent implements OnInit {
  Person: FormGroup;


  constructor(private fb: FormBuilder,
              private Http:HttpClient,
              private router:Router
            ) {  }

  ngOnInit() {
    // Form

    this.Person = this.fb.group({
      name: new FormControl(null, []),
      gender: new FormControl("", []),
      date: new FormControl(null,[]),
      idCardNumber: new FormControl(null, []),
      address: new FormControl(null, []),
      PhoneNumber: new FormControl(null, []),
      email: new FormControl(null, []),
      password: new FormControl(null, []),
      Age: new FormControl(null, []),
      career: new FormControl(null, []),
    });
  }

  save(){

    if(this.Person.value.name=='' || this.Person.value.idCardNumber=='' ||
      this.Person.value.address=='' || this.Person.value.PhoneNumber=='' ||
      this.Person.value.date=='' || this.Person.value.email=='' ||
      this.Person.value.Age=='' || this.Person.value.career=='' ||
      this.Person.value.password=='' ||this.Person.value.gender=='')
      alert("คุณกรอกข้อมูลไม่ครบ");
    else{
      this.Http.get("http://localhost:8080/InformationPerson/"
      +this.Person.value.name+"/"+this.Person.value.idCardNumber+"/"
      +this.Person.value.address+"/"+this.Person.value.PhoneNumber+"/"
      +this.Person.value.date+"/"+this.Person.value.email+"/"+this.Person.value.Age+"/"
      +this.Person.value.career+"/"+this.Person.value.password+"/"
      +this.Person.value.gender+"/"+"employeePosition")
      .subscribe(data => { console.log('PUT Request is successful', data); } , error => { console.log('Error', error); } );
      this.router.navigate(['/login']);

    }



  }

}
