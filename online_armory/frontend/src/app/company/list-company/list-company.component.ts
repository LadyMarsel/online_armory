import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { Router } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-list-company',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './list-company.component.html',
  styleUrl: './list-company.component.css'
})
export class ListCompanyComponent implements OnInit{

  companiesList: Company[];

  constructor(
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit(){
    this.companiesList = this.crudService.getCompaniesList();
  }

  goToCompany(company: Company){
    this.router.navigate(['/company', company.id]);
  }
  
}
