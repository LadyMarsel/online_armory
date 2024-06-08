import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { LicenseType } from '../license-type';
import { Router } from '@angular/router';
import { CrudService } from '../../services/crud.service';

@Component({
  selector: 'app-list-licence-type',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './list-licence-type.component.html',
  styleUrl: './list-licence-type.component.css'
})
export class ListLicenceTypeComponent implements OnInit {

  licenseTypesList: LicenseType[] = [];

  constructor(
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit(){
  this.crudService.getLicenseTypesList().subscribe(data => this.licenseTypesList = data);
  }

  goToLicenseType(licenseType: LicenseType){
    this.router.navigate(['/licenseType', licenseType.id]);
  }
  
  
}
