import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { ActivatedRoute, Router } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-detail-company',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './detail-company.component.html',
  styleUrl: './detail-company.component.css'
})

export class DetailCompanyComponent implements OnInit {
  companysList: Company[];
  company: Company|undefined;

  constructor(
    private route: ActivatedRoute, 
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit() {
    const companyId: string|null = this.route.snapshot.paramMap.get('id'); //Permet d'acceder à l'url à un instant T
    if(companyId){
      this.crudService.getCompanyById(+companyId).subscribe(data => this.company = data);
    }
  }

  goToCompaniesList(){
    this.router.navigate(['/companies']);
  }

  
  goToEditCompany(company: Company) {
    this.router.navigate(['/edit/company', company.id]);
  }

  deleteCompany(company: Company) {
    this.crudService.deleteCompanyById(company.id).subscribe(() => this.goToCompaniesList());
  }

}
