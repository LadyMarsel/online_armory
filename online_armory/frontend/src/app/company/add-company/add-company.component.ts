import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { FormCompanyComponent } from '../form-company/form-company.component';

@Component({
  selector: 'app-add-company',
  standalone: true,
  imports: [
    FormCompanyComponent
  ],
  templateUrl: './add-company.component.html',
  styleUrl: './add-company.component.css'
})

export class AddCompanyComponent implements OnInit {
  company: Company;

  ngOnInit(){
    this.company = new Company();
  }
}
