import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  private api = 'http://localhost:8080/api/underwriters';
  constructor(private http: HttpClient) { }

  registerUnderwriter(underwriterData: any): Observable<any> {
    return this.http.post(this.api, underwriterData);
  }
}
