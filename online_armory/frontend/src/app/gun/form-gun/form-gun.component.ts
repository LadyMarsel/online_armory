import { Component, Input, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CrudService } from '../../services/crud.service';
import { Gun } from '../gun';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { Company } from '../../company/company';
import { GunType } from '../../gyn-type/gun-type';
import { Caliber } from '../../caliber/caliber';
import { RearmingMode } from '../../rearming-mode/rearming-mode';
import { InternalMechanic } from '../../internal-mechanic/internal-mechanic';
import { Country } from '../../country';

@Component({
  selector: 'app-form-gun',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule
  ],
  templateUrl: './form-gun.component.html',
  styleUrl: './form-gun.component.css'
})

export class FormGunComponent implements OnInit{
  @Input() gun: Gun;
  isAddForm: boolean;
  companies: Company[] = [];
  gunTypes: GunType[] = [];
  calibers: Caliber[] = [];
  rearmingModes: RearmingMode[] = [];
  internalMechanics: InternalMechanic[] = [];
  countries: Country[] = [];

  constructor(
    private crudService: CrudService, 
    private router: Router
  ){}

  ngOnInit() {
    this.crudService.getCompaniesList().subscribe(data => this.companies = data);/*
    this.countries = this.crudService.getCountriesList()
    this.isAddForm = this.router.url.includes('add');*/
  }

  /*hasCompany(company: string): boolean {
    return this.gun.company.includes(company);
  }

  selectCompany($event: Event, company: Company){
    const isChecked: boolean= ($event.target as HTMLInputElement).checked;

    if(isChecked){
      this.gun.company.push(company);
    }else{
      const index = this.gun.company.indexOf(company);
      this.gun.company.slice(index, 1);
    }
  }*/

  onSubmit(){
    if(this.isAddForm){
      this.crudService.addGun(this.gun).subscribe((gun: Gun) => this.router.navigate(['/gun', gun.id]));
    }else{
      this.crudService.updateGun(this.gun).subscribe(() => this.router.navigate(['/gun', this.gun.id]));
    }
      
  }
}
