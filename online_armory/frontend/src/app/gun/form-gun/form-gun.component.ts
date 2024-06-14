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
    this.crudService.getCompaniesList().subscribe(data => this.companies = data);
    this.crudService.getGunTypesList().subscribe(data => this.gunTypes = data);
    this.crudService.getCalibersList().subscribe(data => this.calibers = data);
    this.crudService.getRearmingModesList().subscribe(data => this.rearmingModes = data);
    this.crudService.getInternalMechanicsList().subscribe(data => this.internalMechanics = data);
    this.crudService.getCountriesList().subscribe(data => this.countries = data);
    this.isAddForm = this.router.url.includes('add');
  }

  onSubmit(){
    console.log(JSON.stringify(this.gun));
    if(this.isAddForm){
      this.crudService.addGun(this.gun).subscribe((gun: Gun) => this.router.navigate(['/gun', gun.id]));
    }else{
      this.crudService.updateGun(this.gun).subscribe(() => this.router.navigate(['/gun', this.gun.id]));
    }
      
  }
}
