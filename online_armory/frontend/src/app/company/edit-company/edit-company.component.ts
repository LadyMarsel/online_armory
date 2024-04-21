import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { ActivatedRoute } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';
import { FormCompanyComponent } from '../form-company/form-company.component';

@Component({
  selector: 'app-edit-company',
  standalone: true,
  imports: [
    CommonModule,
    FormCompanyComponent
  ],
  templateUrl: './edit-company.component.html',
  styleUrl: './edit-company.component.css'
})

export class EditCompanyComponent implements OnInit {

  company: Company|undefined;

  constructor(
    private route: ActivatedRoute,
    private crudService: CrudService,
  ){}

  ngOnInit() {
      const companyId: string|null = this.route.snapshot.paramMap.get('id');
      if(companyId){
        this.crudService.getCompanyById(+companyId).subscribe(data => this.company = data);
      }else{
        this.company = undefined;
      }
  }

}
