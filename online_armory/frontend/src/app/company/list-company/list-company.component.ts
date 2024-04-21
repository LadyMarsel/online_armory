import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { Router } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-list-company',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './list-company.component.html',
  styleUrl: './list-company.component.css'
})

export class ListCompanyComponent implements OnInit {
  companiesList: Company[];

  constructor(
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit(){
  this.crudService.getCompaniesList().subscribe(data => this.companiesList = data);
  }

  goToCompany(company: Company){
    this.router.navigate(['/company', company.id]);
  }

  goToAddCompany() {
    this.router.navigate(['/company/add']);
  }

}
