import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { ActivatedRoute, Router } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-detail-company',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './detail-company.component.html',
  styleUrl: './detail-company.component.css'
})

export class DetailCompanyComponent implements OnInit{
  companiesList: Company[];
  company: Company|undefined;

  constructor(
    private route: ActivatedRoute, 
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit() {
    const companyId: string|null = this.route.snapshot.paramMap.get('id'); //Permet d'acceder à l'url à un instant T
    if(companyId){
      this.company = this.crudService.getCompanyById(+companyId);
    }
  }

  goToCompaniesList(){
    this.router.navigate(['/companies']);
  }
}
