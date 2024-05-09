import { Injectable } from '@angular/core';
import { Gun } from '../gun/gun';
import { Company } from '../company/company';
import { Ammunition } from '../ammunition/ammunition';
import { Observable, catchError, of, tap } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { License } from '../license/license';
import { Professionnal } from '../professionnal/professionnal';
import { Caliber } from '../caliber/caliber';

@Injectable({providedIn: 'root'})
export class CrudService {
  baseUrl='http://localhost:8080'

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

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

/*
----------------------------------- GUNS -----------------------------------
*/

  /* Read - Get all */
  
  getGunsList(): Observable<Gun[]>{
    return this.http.get<Gun[]>(this.baseUrl+'/guns').pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, []))
    );
  }

  /* Read - Get one if it exist */

  getGunById(gunId: number):Observable<Gun|undefined>{
    return this.http.get<Gun>(this.baseUrl+`/gun/${gunId}`).pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, undefined))
    );
  }

  /* Create - Create one */

  addGun(gun: Gun): Observable<Gun> {
    return this.http.post<Gun>(this.baseUrl+'/gun', gun, this.httpOptions).pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, null))
    );
  }

  /* Update - Update an existing one */

  updateGun(gun: Gun): Observable<Gun|undefined> {
    return this.http.put(this.baseUrl+'/gun', gun, this.httpOptions).pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, null))
    );
  }

  /* Delete - Delete one */

  deleteGunById(gunId: number): Observable<null> {
    return this.http.delete(this.baseUrl+'/gun/${gunId}').pipe(
      tap((response) => this.log(response)),
      catchError((error) => this.handleError(error, undefined))
    );
  }

/*
----------------------------------- AMMUNITION -----------------------------------
*/

/* Read - Get all */
  
getAmmunitionsList(): Observable<Ammunition[]>{
  return this.http.get<Ammunition[]>(this.baseUrl+'/ammunitions').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getAmmunitionById(ammunitionId: number):Observable<Ammunition|undefined>{
  return this.http.get<Ammunition>(this.baseUrl+`/ammunition/${ammunitionId}`).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addAmmunition(ammunition: Ammunition): Observable<Ammunition> {
  return this.http.post<Ammunition>(this.baseUrl+'/ammunition', ammunition, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateAmmunition(ammunition: Ammunition): Observable<Ammunition|undefined> {
  return this.http.put(this.baseUrl+'/ammunition', ammunition, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteAmmunitionById(ammunitionId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/ammunition/${ammunitionId}').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- COMPANY -----------------------------------
*/

/* Read - Get all */
  
getCompaniesList(): Observable<Company[]>{
  return this.http.get<Company[]>(this.baseUrl+'/companies').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getCompanyById(companyId: number):Observable<Company|undefined>{
  return this.http.get<Company>(this.baseUrl+`/company/${companyId}`).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addCompany(company: Company): Observable<Company> {
  return this.http.post<Company>(this.baseUrl+'/company', company, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateCompany(company: Company): Observable<Company|undefined> {
  return this.http.put(this.baseUrl+'/company', company, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteCompanyById(companyId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/company/${companyId}').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- LICENSE -----------------------------------
*/

/* Read - Get all */
  
getLicensesList(): Observable<License[]>{
  return this.http.get<License[]>(this.baseUrl+'/licenses').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getLicenseById(licenseId: number):Observable<License|undefined>{
  return this.http.get<License>(this.baseUrl+`/license/${licenseId}`).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addLicense(license: License): Observable<License> {
  return this.http.post<License>(this.baseUrl+'/license', license, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateLicense(license: License): Observable<License|undefined> {
  return this.http.put(this.baseUrl+'/license', license, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteLicenseById(licenseId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/license/${licenseId}').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- PROFESSIONAL -----------------------------------
*/

/* Read - Get all */
  
getProfessionnalsList(): Observable<Professionnal[]>{
  return this.http.get<Professionnal[]>(this.baseUrl+'/professionnals').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getProfessionnalById(professionnalId: number):Observable<Professionnal|undefined>{
  return this.http.get<Professionnal>(this.baseUrl+`/professionnal/${professionnalId}`).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addProfessionnal(professionnal: Professionnal): Observable<Professionnal> {
  return this.http.post<Professionnal>(this.baseUrl+'/professionnal', professionnal, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateProfessionnal(professionnal: Professionnal): Observable<Professionnal|undefined> {
  return this.http.put(this.baseUrl+'/professionnal', professionnal, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteProfessionnalById(professionnalId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/professionnal/${professionnalId}').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- CALIBER -----------------------------------
*/

/* Read - Get all */
  
getCalibersList(): Observable<Caliber[]>{
  return this.http.get<Caliber[]>(this.baseUrl+'/calibers').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getCaliberById(caliberId: number):Observable<Caliber|undefined>{
  return this.http.get<Caliber>(this.baseUrl+`/caliber/${caliberId}`).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addCaliber(caliber: Caliber): Observable<Caliber> {
  return this.http.post<Caliber>(this.baseUrl+'/caliber', caliber, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateCaliber(caliber: Caliber): Observable<Caliber|undefined> {
  return this.http.put(this.baseUrl+'/caliber', caliber, this.httpOptions).pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteCaliberById(caliberId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/caliber/${caliberId}').pipe(
    tap((response) => this.log(response)),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- XX -----------------------------------
*/
  
}
