import { Component, Input, OnInit } from '@angular/core';
import { Professionnal } from '../professionnal';
import { CrudService } from '../../services/crud.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ProfessionnalType } from '../../professionnal-type/professionnal-type';
import { Country } from '../../country';

@Component({
  selector: 'app-form-professionnal',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule
  ],
  templateUrl: './form-professionnal.component.html',
  styleUrl: './form-professionnal.component.css'
})

export class FormProfessionnalComponent implements OnInit{
  @Input() professionnal: Professionnal;
  isAddForm: boolean;
  professionnalTypes: ProfessionnalType[] = [];
  countries: Country[] = [];

  constructor(
    private crudService: CrudService, 
    private router: Router
  ){}

  ngOnInit(): void {
    this.crudService.getProfessionnalTypesList().subscribe(data => {
      this.professionnalTypes = data;
      for(let professionnalType of this.professionnalTypes)
        if (professionnalType.id==this.professionnal.professionnalType.id)
          this.professionnal.professionnalType = professionnalType;
      }
    );
    this.crudService.getCountriesList().subscribe(data => {
      this.countries = data;
      for(let country of this.countries)
        if (country.id==this.professionnal.country.id)
          this.professionnal.country = country;
      }
    );
    this.isAddForm = this.router.url.includes('add');
  }

  onSubmit(){
    if(this.isAddForm){
      this.crudService.addProfessionnal(this.professionnal).subscribe(() => this.router.navigate(['/professionnals'])); 
    }else{
      this.crudService.updateProfessionnal(this.professionnal).subscribe(() => this.router.navigate(['/professionnals'])); 
    }
  }

  goToProfessionnalsList(){
    this.router.navigate(['/professionnals']);
  }
}
