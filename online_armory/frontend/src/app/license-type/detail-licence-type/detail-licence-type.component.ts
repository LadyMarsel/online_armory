import { Component, OnInit } from '@angular/core';
import { LicenseType } from '../license-type';
import { ActivatedRoute, Router } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-detail-licence-type',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './detail-licence-type.component.html',
  styleUrl: './detail-licence-type.component.css'
})
export class DetailLicenceTypeComponent implements OnInit {
    licenseTypesList: LicenseType[];
    licenseType: LicenseType|undefined;
  
    constructor(
      private route: ActivatedRoute, 
      private router: Router,
      private crudService: CrudService
      ){}
  
    ngOnInit() {
      const licenseTypeId: string|null = this.route.snapshot.paramMap.get('id'); //Permet d'acceder à l'url à un instant T
      if(licenseTypeId){
        this.crudService.getLicenseTypeById(+licenseTypeId).subscribe(data => this.licenseType = data);
      }
    }
  
    goTolicenseTypesList(){
      this.router.navigate(['/licenseTypes']);
    }
}
