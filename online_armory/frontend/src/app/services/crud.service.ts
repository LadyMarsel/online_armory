import { Injectable } from '@angular/core';
import { Gun } from '../gun/gun';
import { Company } from '../company/company';
import { Ammunition } from '../ammunition/ammunition';
import { Observable, catchError, of, tap } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { License } from '../license/license';
import { Professionnal } from '../professionnal/professionnal';
import { Caliber } from '../caliber/caliber';
import { ProfessionnalType } from '../professionnal-type/professionnal-type';
import { Country } from '../country';
import { RearmingMode } from '../rearming-mode/rearming-mode';
import { InternalMechanic } from '../internal-mechanic/internal-mechanic';
import { GunType } from '../gyn-type/gun-type';
import { LicenseType } from '../license-type/license-type';

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
      tap((response) => console.log('Guns List debug>>>'+JSON.stringify(response))),
      catchError((error) => this.handleError(error, []))
    );
  }

  /* Read - Get one if it exist */

  getGunById(gunId: number):Observable<Gun|undefined>{
    return this.http.get<Gun>(this.baseUrl+`/gun/${gunId}`).pipe(
      tap((response) => console.log('Gun by ID debug>>>'+JSON.stringify(response))),
      catchError((error) => this.handleError(error, undefined))
    );
  }

  /* Create - Create one */

  addGun(gun: Gun): Observable<Gun> {
    return this.http.post<Gun>(this.baseUrl+'/gun', gun, this.httpOptions).pipe(
      tap((response) => console.log('Add Gun debug>>>'+JSON.stringify(response))),
      catchError((error) => this.handleError(error, null))
    );
  }

  /* Update - Update an existing one */

  updateGun(gun: Gun): Observable<Gun|undefined> {
    return this.http.put(this.baseUrl+'/gun/' + gun.id, gun, this.httpOptions).pipe(
      tap((response) => console.log('Update Gun debug>>>'+JSON.stringify(response))),
      catchError((error) => this.handleError(error, null))
    );
  }

  /* Delete - Delete one */

  deleteGunById(gunId: number): Observable<null> {
    return this.http.delete(this.baseUrl+'/gun/'+ gunId).pipe(
      tap((response) => console.log('Delete Gun debug>>>'+JSON.stringify(response))),
      catchError((error) => this.handleError(error, undefined))
    );
  }

/*
----------------------------------- AMMUNITION -----------------------------------
*/

/* Read - Get all */
  
getAmmunitionsList(): Observable<Ammunition[]>{
  return this.http.get<Ammunition[]>(this.baseUrl+'/ammunitions').pipe(
    tap((response) => console.log('Ammunitions List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getAmmunitionById(ammunitionId: number):Observable<Ammunition|undefined>{
  return this.http.get<Ammunition>(this.baseUrl+`/ammunition/${ammunitionId}`).pipe(
    tap((response) => console.log('Ammunition by ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addAmmunition(ammunition: Ammunition): Observable<Ammunition> {
  return this.http.post<Ammunition>(this.baseUrl+'/ammunition', ammunition, this.httpOptions).pipe(
    tap((response) => console.log('Add Ammunnition debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateAmmunition(ammunition: Ammunition): Observable<Ammunition|undefined> {
  return this.http.put(this.baseUrl+'/ammunition/' + ammunition.id, ammunition, this.httpOptions).pipe(
    tap((response) => console.log('Update Ammunition debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteAmmunitionById(ammunitionId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/ammunition/' + ammunitionId).pipe(
    tap((response) => console.log('Delete Ammunition debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- COMPANY -----------------------------------
*/

/* Read - Get all */
  
getCompaniesList(): Observable<Company[]>{
  return this.http.get<Company[]>(this.baseUrl+'/companies').pipe(
    tap((response) => console.log('Companies List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getCompanyById(companyId: number):Observable<Company|undefined>{
  return this.http.get<Company>(this.baseUrl+`/company/${companyId}`).pipe(
    tap((response) => console.log('Company By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addCompany(company: Company): Observable<Company> {
  return this.http.post<Company>(this.baseUrl+'/company', company, this.httpOptions).pipe(
    tap((response) => console.log('Add Company debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateCompany(company: Company): Observable<Company> {
  return this.http.put(this.baseUrl+'/company/' + company.id, company, this.httpOptions).pipe(
    tap((response) => console.log('Update Company debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteCompanyById(companyId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/company/' + companyId).pipe(
    tap((response) => console.log('Delete Company debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}



/*
----------------------------------- LICENSE -----------------------------------
*/

/* Read - Get all */
  
getLicensesList(): Observable<License[]>{
  return this.http.get<License[]>(this.baseUrl+'/licenses').pipe(
    tap((response) => console.log('Licences List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getLicenseById(licenseId: number):Observable<License|undefined>{
  return this.http.get<License>(this.baseUrl+`/license/${licenseId}`).pipe(
    tap((response) => console.log('Licence By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addLicense(license: License): Observable<License> {
  return this.http.post<License>(this.baseUrl+'/license', license, this.httpOptions).pipe(
    tap((response) => console.log('Add Licence debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateLicense(license: License): Observable<License|undefined> {
  return this.http.put(this.baseUrl+'/license/' + license.id, license, this.httpOptions).pipe(
    tap((response) => console.log('Update Licence debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteLicenseById(licenseId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/license/' + licenseId).pipe(
    tap((response) => console.log('Delete Licence debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- PROFESSIONAL -----------------------------------
*/

/* Read - Get all */
  
getProfessionnalsList(): Observable<Professionnal[]>{
  return this.http.get<Professionnal[]>(this.baseUrl+'/professionnals').pipe(
    tap((response) => console.log('Professionnals List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getProfessionnalById(professionnalId: number):Observable<Professionnal|undefined>{
  return this.http.get<Professionnal>(this.baseUrl+`/professionnal/${professionnalId}`).pipe(
    tap((response) => console.log('Professionnal By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addProfessionnal(professionnal: Professionnal): Observable<Professionnal> {
  return this.http.post<Professionnal>(this.baseUrl+'/professionnal', professionnal, this.httpOptions).pipe(
    tap((response) => console.log('Add Professionnal debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateProfessionnal(professionnal: Professionnal): Observable<Professionnal|undefined> {
  return this.http.put(this.baseUrl+'/professionnal/' + professionnal.id, professionnal, this.httpOptions).pipe(
    tap((response) => console.log('Update Professionnal debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteProfessionnalById(professionnalId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/professionnal/' + professionnalId).pipe(
    tap((response) => console.log('Delete Professionnal debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- CALIBER -----------------------------------
*/

/* Read - Get all */
  
getCalibersList(): Observable<Caliber[]>{
  return this.http.get<Caliber[]>(this.baseUrl+'/calibers').pipe(
    tap((response) => console.log('Calibers List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getCaliberById(caliberId: number):Observable<Caliber|undefined>{
  return this.http.get<Caliber>(this.baseUrl+`/caliber/${caliberId}`).pipe(
    tap((response) => console.log('Caliber By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/* Create - Create one */

addCaliber(caliber: Caliber): Observable<Caliber> {
  return this.http.post<Caliber>(this.baseUrl+'/caliber', caliber, this.httpOptions).pipe(
    tap((response) => console.log('Add Caliber debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Update - Update an existing one */

updateCaliber(caliber: Caliber): Observable<Caliber|undefined> {
  return this.http.put(this.baseUrl+'/caliber/' + caliber.id, caliber, this.httpOptions).pipe(
    tap((response) => console.log('Update Caliber debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, null))
  );
}

/* Delete - Delete one */

deleteCaliberById(caliberId: number): Observable<null> {
  return this.http.delete(this.baseUrl+'/caliber/' + caliberId).pipe(
    tap((response) => console.log('Delete Caliber debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- COUNTRY -----------------------------------
*/

/* Read - Get all */
  
getCountriesList(): Observable<Country[]>{
  return this.http.get<Country[]>(this.baseUrl+'/countries').pipe(
    tap((response) => console.log('Countries List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getCountryById(countryId: number):Observable<Country|undefined>{
  return this.http.get<Country>(this.baseUrl+`/country/${countryId}`).pipe(
    tap((response) => console.log('Country By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- REARMING MODE -----------------------------------
*/

/* Read - Get all */
  
getRearmingModesList(): Observable<RearmingMode[]>{
  return this.http.get<RearmingMode[]>(this.baseUrl+'/rearmingModes').pipe(
    tap((response) => console.log('RearmingModes List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getRearmingModeById(rearmingModeId: number):Observable<RearmingMode|undefined>{
  return this.http.get<RearmingMode>(this.baseUrl+`/rearmingMode/${rearmingModeId}`).pipe(
    tap((response) => console.log('RearmmingMode By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- INTERNAL MECHANIC -----------------------------------
*/

/* Read - Get all */
  
getInternalMechanicsList(): Observable<InternalMechanic[]>{
  return this.http.get<InternalMechanic[]>(this.baseUrl+'/internalMechanics').pipe(
    tap((response) => console.log('InternalMechanics List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getInternalMechanicById(internalMechanicId: number):Observable<InternalMechanic|undefined>{
  return this.http.get<InternalMechanic>(this.baseUrl+`/internalMechanic/${internalMechanicId}`).pipe(
    tap((response) => console.log('InternalMechanic By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- GUN TYPE -----------------------------------
*/

/* Read - Get all */
  
getGunTypesList(): Observable<GunType[]>{
  return this.http.get<GunType[]>(this.baseUrl+'/gunTypes').pipe(
    tap((response) => console.log('GunTypes List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getGunTypeById(gunTypeId: number):Observable<GunType|undefined>{
  return this.http.get<GunType>(this.baseUrl+`/gunType/${gunTypeId}`).pipe(
    tap((response) => console.log('GunType By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- PROFESSIONAL TYPE -----------------------------------
*/

/* Read - Get all */
  
getProfessionnalTypesList(): Observable<ProfessionnalType[]>{
  return this.http.get<ProfessionnalType[]>(this.baseUrl+'/professionnalTypes').pipe(
    tap((response) => console.log('ProfessionnalTypes List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getProfessionnalTypeById(professionnalTypeId: number):Observable<ProfessionnalType|undefined>{
  return this.http.get<ProfessionnalType>(this.baseUrl+`/professionnalType/${professionnalTypeId}`).pipe(
    tap((response) => console.log('ProfessionnalType By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}

/*
----------------------------------- LICENSE TYPE -----------------------------------
*/

/* Read - Get all */
  
getLicenseTypesList(): Observable<LicenseType[]>{
  return this.http.get<LicenseType[]>(this.baseUrl+'/licenseTypes').pipe(
    tap((response) => console.log('LicenceTypes List debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, []))
  );
}

/* Read - Get one if it exist */

getLicenseTypeById(licenseTypeId: number):Observable<LicenseType|undefined>{
  return this.http.get<LicenseType>(this.baseUrl+`/licenseType/${licenseTypeId}`).pipe(
    tap((response) => console.log('LicenceType By ID debug>>>'+JSON.stringify(response))),
    catchError((error) => this.handleError(error, undefined))
  );
}
  
}
