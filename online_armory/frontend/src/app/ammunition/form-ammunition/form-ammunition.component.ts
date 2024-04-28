import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Ammunition } from '../ammunition';
import { CrudService } from '../../services/crud.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-ammunition',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule
  ],
  templateUrl: './form-ammunition.component.html',
  styleUrl: './form-ammunition.component.css'
})

export class FormAmmunitionComponent {
  @Input() ammunition: Ammunition;
  isAddForm: boolean;

  constructor(
    private crudService: CrudService,
    private router: Router
  ){}

  ngOnInit(): void {
    this.isAddForm = this.router.url.includes('add');
  }

  onSubmit(){
    if(this.isAddForm){
      this.crudService.addAmmunition(this.ammunition).subscribe((ammunition: Ammunition) => this.router.navigate(['/ammunition', ammunition.id]));
    }else{
      this.crudService.updateAmmunition(this.ammunition).subscribe(() => this.router.navigate(['/ammunition', this.ammunition.id]));
    }
  }
}