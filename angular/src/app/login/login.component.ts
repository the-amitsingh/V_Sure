import { Component } from '@angular/core';
//import {MatSnackBar} from '@angular/material/snack-bar'
import { HttpClient} from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  standalone: false,
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  userDetils: any = {};

 user: any = {

  name: '',

  password: ''

 };

 // Updated regex pattern: Username can only have alphabets and/or numbers, no special characters or spaces.

 usernamePattern: string = '^[A-Za-z][A-Za-z0-9]*$'; // Only alphanumeric (and starting with a letter)

 // Password should not contain spaces, should be at least 6 characters, and not match username

 passwordPattern: string = '^(?!.*\\s)(?!.*' + this.user.name + ').{6,}$'; // Password must not have spaces and must be different from username

 constructor(private http: HttpClient, private route: Router) {}

 // Function to validate errors in form control

 hasError(control: any, error: string): boolean {

  return control?.errors?.[error];

 }

 btn() {

  if (this.user.name !== "" && this.user.password !== "") {

   this.http.post(`http://localhost:8081/login/${this.user.name}/${this.user.password}`, null)

    .subscribe({

     next: (data: any) => {

      this.userDetils = data;

      console.log(this.userDetils.role);

      sessionStorage.setItem('role', this.userDetils.role);

      sessionStorage.setItem('name', this.userDetils.name);

      sessionStorage.setItem('id', this.userDetils.id);

      if (this.userDetils.role === "admin") {

       this.route.navigate(['/admin']);

      }

      if (this.userDetils.role === "user") {

       this.route.navigate(['/underwriter']);

      }

     },

     error: (error: any) => {

      console.log(error);

     }

    });

  }

 }
}