import { Component } from '@angular/core';
import { Company } from '../company';
import { CrudService } from '../../services/crud.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-form-company',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './form-company.component.html',
  styleUrl: './form-company.component.css'
})
export class FormCompanyComponent {
  company: Company = new Company();

  constructor(private crudService: CrudService)
  {

  }

  addCompany()
  {
this.crudService.addCompany(this.company).subscribe(
  reponse => console.log(reponse)
)
  }
}
