import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormAmmunitionComponent } from '../form-ammunition/form-ammunition.component';
import { Ammunition } from '../ammunition';
import { ActivatedRoute } from '@angular/router';
import { CrudService } from '../../services/crud.service';

@Component({
  selector: 'app-edit-ammunition',
  standalone: true,
  imports: [
    CommonModule,
    FormAmmunitionComponent
  ],
  templateUrl: './edit-ammunition.component.html',
  styleUrl: './edit-ammunition.component.css'
})

export class EditAmmunitionComponent {

  ammunition: Ammunition|undefined;

  constructor(
    private route: ActivatedRoute,
    private crudService: CrudService
  ){}

  ngOnInit(): void {
    const ammunitionId: string|null = this.route.snapshot.paramMap.get('id');
    if(ammunitionId){
      this.crudService.getAmmunitionById(+ammunitionId).subscribe(data => this.ammunition = data);
    }else {
      this.ammunition = undefined;
    }
  }

}
