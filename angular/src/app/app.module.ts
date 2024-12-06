import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { LoginComponent } from './login/login.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SearchComponent } from './search/search.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AdminComponent } from './admin/admin.component';
import { UnderwriterComponent } from './underwriter/underwriter.component';
import { HomeComponent } from './home/home.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { FooterComponent } from './footer/footer.component';
import { RegisterUnderWriterComponent } from './register-under-writer/register-under-writer.component';
import { AddInsuranceComponent } from './add-insurance/add-insurance.component';
import { ViewhistoryComponent } from './viewhistory/viewhistory.component';
import { UpdatePasswordComponent } from './update-password/update-password.component';


@NgModule({
  declarations: [
    AppComponent,
    SearchComponent,
    LoginComponent,
    AdminComponent,
    UnderwriterComponent,
    HomeComponent,
    NavBarComponent,
    FooterComponent,
    RegisterUnderWriterComponent,
    AddInsuranceComponent,
    ViewhistoryComponent,
    UpdatePasswordComponent,
    
  ],
  imports: [
    BrowserModule,
    
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
