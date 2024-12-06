import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-register-under-writer',
  templateUrl: './register-under-writer.component.html',
  styleUrl: './register-under-writer.component.css'
})

export class RegisterUnderWriterComponent {
  
  underwriterForm: FormGroup;
  savedData: any = null;
  isSubmitted = false;

  constructor(private fb: FormBuilder) {
    this.underwriterForm = this.fb.group({
      name: ['', Validators.required],
      dob: ['', Validators.required],
      gender: ['', Validators.required],
      address: ['', Validators.required],
      underWriterId: ['', Validators.required],
      joiningDate: ['', Validators.required],
      password: ['', [Validators.required, Validators.minLength(6)]],
    });
  }
  onSubmit() {
    this.isSubmitted = true;
    if (this.underwriterForm.valid) {
      this.savedData = this.underwriterForm.value;
      console.log('Saved Data:', this.savedData);
    }
    // const underwriterData = this.underwriterForm.value;
    // this.adminService.registerUnderwriter(underwriterData).subscribe(
    //   (response) => {
    //     // Handle successful response
    //     this.savedData = response;
    //     console.log('Registration Successful:', response);
    //   },
    //   (error) => {
    //     // Handle error response
    //     console.error('Registration Failed:', error);
    //     this.savedData = null; // In case of failure, set to null
    //   }
    // );
  }

  // exportToPDF() {
  //   const doc = new jsPDF();
  //   doc.text(`Under Writer Details:`, 10, 10);
  //   Object.entries(this.savedData).forEach(([key, value], index) => {
  //     doc.text(`${key}: ${value}`, 10, 20 + index * 10);
  //   });
  //   doc.save('underwriter-details.pdf');
  // }
}
