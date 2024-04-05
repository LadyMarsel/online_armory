import { Injectable } from '@angular/core';
import { Gun } from '../gun/gun';
import { Company } from '../company/company';
import { COMPANIES } from '../company/mock-companies';
import { Ammunition } from '../ammunition/ammunition';
import { AMMUNITIONS } from '../ammunition/mock-ammunition';
import { Observable, catchError, of, tap } from 'rxjs';
import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';

@Injectable({providedIn: 'root'})
export class CrudService {
  baseUrl='http://localhost:8080'

  constructor(
    private http: HttpClient
    ){}
  
  private log(response: any|undefined) {
    console.table(response);
  }

  private handleError(error: Error, errorValue: any) {
    console.error(error);
    return of(errorValue);
  }

  /*---------- GUNS ----------*/

  getGunsList(): Observable<Gun[]>{
    return this.http.get<Gun[]>(this.baseUrl+'/guns').pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, []))
    );
  }

  getGunById(gunId: number):Observable<Gun|undefined>{
    return this.http.get<Gun>(this.baseUrl+`/gun/${gunId}`).pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, undefined))
    );
  }

  addGun(gun: Gun): Observable<Gun> {
    const httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    };

    return this.http.post<Gun>(this.baseUrl+'/guns', gun, httpOptions).pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, null))
    );
  }

  updateGun(gun: Gun): Observable<Gun|undefined> {
    const httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    };

    return this.http.put(this.baseUrl+'/gun', gun, httpOptions).pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, null))
    );
  }

  deleteGunById(gunId: number): Observable<null> {
    return this.http.delete(this.baseUrl+'/gun/${gunId}').pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, undefined))
    );
  }

  /*---------- AMMUNITION ----------*/

  getAmmunitionsList(): Ammunition[]{
    return AMMUNITIONS;
  }

  getAmmunitionById(ammunitionId: number): Ammunition|undefined{
    return AMMUNITIONS.find(ammunition => ammunition.id == ammunitionId);
  }

  /*---------- COMPANY ----------*/

  getCompaniesList(): Company[]{
    return COMPANIES;
  }

  getCompanyById(companyId: number): Company|undefined{
    return COMPANIES.find(company => company.id == companyId);
  }

  /*---------- LICENSE ----------*/

  /*---------- PROFESSIONAL ----------*/

  
  
}
