import { Component, Input, OnInit } from '@angular/core';
import { Company } from '../company';
import { CrudService } from '../../services/crud.service';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { Country } from '../../country';


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
  countries:Country[] = [];
  country: any;
  
  constructor(
    private crudService: CrudService, 
    private router: Router
  ){}

  ngOnInit() {
    this.crudService.getCountriesList().subscribe(data => {
      this.countries = data; 
      for(let country of this.countries)
        if (country.id==this.company.country.id)
          this.company.country = country;
      }
    );
    this.isAddForm = this.router.url.includes('add');
  }

  onSubmit(){
    if(this.isAddForm){
      this.crudService.addCompany(this.company).subscribe((company: Company) => this.router.navigate(['/company', company.id]));
    }else{
      this.crudService.updateCompany(this.company).subscribe(() => this.router.navigate(['/company', this.company.id]));
    }
  }

  hasCountry(): string {
    return this.company.country.name;
  }
  
    goToCompaniesList(){
      this.router.navigate(['/companies']);
    }

    // private getAllDiveplace(id :any){
    //   this._siteHttpService.getAllSiteAndVote(id).subscribe({
    //     next : (data :any) =>{
    //       this._sites = data
    //       this._sites = this._sites.filter((c : any) => c.isActive == 1 )
    //     },
    //     error : (error) => {
    //       console.log(error)
    //     }}) ;
    //  }



onSelectedCountry(event : any) : void {
  this.countries.forEach((country : any) => {
    if(country.id == event.target.value){
      this.country = country;
    }
  })
  console.log(this.country);
  }
      
}
