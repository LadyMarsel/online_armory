import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  base_url = "http://localhost:8080/";
  httpClient:HttpClient;
  httpOptions = {
    headers: new HttpHeaders({
      "Content-type":"application/json"
    })
  }

  constructor(_httpClient: HttpClient) {
    this.httpClient=_httpClient;
   }


public getMembers():Observable<any>
{
 let membersRequest:Observable<any>;
 membersRequest = this.httpClient.get(this.base_url+'members',this.httpOptions);
 return membersRequest; 
}



}
