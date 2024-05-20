import { Component, Input, OnInit } from '@angular/core';
import { Professionnal } from '../professionnal';
import { CrudService } from '../../services/crud.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ProfessionnalType } from '../../professionnal-type/professionnal-type';

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
  professionnalTypes: ProfessionnalType[];
  countries: Country[];

  constructor(
    private crudService: CrudService, 
    private router: Router
  ){}

  ngOnInit(): void {
    this.professionnalTypes = this.crudService.getProfessionnalTypesList();
    this.countries = this.crudService.getCountriesList()
    this.isAddForm = this.router.url.includes('add');
  }

  onSubmit(){
    if(this.isAddForm){
      this.crudService.addProfessionnal(this.professionnal).subscribe((professionnal: Professionnal) => this.router.navigate(['/professionnal', professionnal.id]));
    }else{
      this.crudService.updateProfessionnal(this.professionnal).subscribe(() => this.router.navigate(['/professionnal', this.professionnal.id]));
    }
      
  }
}
