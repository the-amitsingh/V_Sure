import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { UnderwriterComponent } from './underwriter/underwriter.component';
import { HomeComponent } from './home/home.component';
import { RegisterUnderWriterComponent } from './register-under-writer/register-under-writer.component';
import { UpdatePasswordComponent } from './update-password/update-password.component';
import { ViewhistoryComponent } from './viewhistory/viewhistory.component';
import { AddInsuranceComponent } from './add-insurance/add-insurance.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'search', component: SearchComponent },
  { path: 'login', component: LoginComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'underwriter', component: UnderwriterComponent },
  { path: 'register-underwriter', component: RegisterUnderWriterComponent},
  {path: 'update-password', component:UpdatePasswordComponent},
  {path: 'viewhistory', component:ViewhistoryComponent},
  {path: 'add-insurance', component:AddInsuranceComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
