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

  constructor(
    private crudService: CrudService, 
    private router: Router
  ){}

  ngOnInit() {
    this.crudService.getCompaniesList().subscribe(data => {
      this.companies = data
      for(let company of this.companies)
        if (company.id==this.gun.company.id)
          this.gun.company = company;
      }
    );
    this.crudService.getGunTypesList().subscribe(data => {
      this.gunTypes = data;
      for(let gunType of this.gunTypes)
        if (gunType.id==this.gun.gunType.id)
          this.gun.gunType = gunType;
      }
    );
    this.crudService.getCalibersList().subscribe(data => {
      this.calibers = data;
      for(let caliber of this.calibers)
        if (caliber.id==this.gun.caliber.id)
          this.gun.caliber = caliber;
      }
    );
    this.crudService.getRearmingModesList().subscribe(data => {
      this.rearmingModes = data;
      for(let rearmingMode of this.rearmingModes)
        if (rearmingMode.id==this.gun.rearmingMode.id)
          this.gun.rearmingMode = rearmingMode;
      }
    );
    this.crudService.getInternalMechanicsList().subscribe(data => {
      this.internalMechanics = data;
      for(let internalMechanic of this.internalMechanics)
        if (internalMechanic.id==this.gun.internalMechanic.id)
          this.gun.internalMechanic = internalMechanic;
      }
    );
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

  goToGunsList(){
    this.router.navigate(['/guns']);
  }
}
