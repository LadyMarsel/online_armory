import { Component, Input, OnInit } from '@angular/core';
import { Company } from '../company';
import { CrudService } from '../../services/crud.service';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-form-company',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule, 
  ],
  templateUrl: './form-company.component.html',
  styleUrl: './form-company.component.css'
})

export class FormCompanyComponent implements OnInit{
  @Input() company: Company;
  isAddForm: boolean;
  countries:string[]=['france','belgique'];
  constructor(
    private crudService: CrudService, 
    private router: Router
  ){}

  ngOnInit() {
    this.isAddForm = this.router.url.includes('add');
  }

  onSubmit(){
    console.log('onSubmit()');
    if(this.isAddForm){
      this.crudService.addCompany(this.company).subscribe((company: Company) => this.router.navigate(['/company', company.id]));
    }else{
      this.crudService.updateCompany(this.company).subscribe(() => this.router.navigate(['/company', this.company.id]));
    }
      
  }
}
