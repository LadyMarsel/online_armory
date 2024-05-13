import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { Router } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';
//import { MatCarouselModule} from '@ng-mat-carousel'

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
  companiesList: Company[] = [];
  startIndex: number = 0;

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

  goToLeft(){
    if(this.startIndex > 0){
      this.startIndex--;
    }else {
      this.startIndex = this.companiesList.length;
    }
  }

  goToRight(){
    if(this.startIndex < this.companiesList.length){
      this.startIndex++;
    }else{
      this.startIndex = 0;
    }
  }

  comparaison(nb1: number, nb2: number){
    if(nb1 < nb2){
      return true;
    }else{
      return false;
    }
  }

}
