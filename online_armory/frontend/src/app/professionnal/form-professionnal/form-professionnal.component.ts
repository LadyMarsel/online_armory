import { Component, Input, OnInit } from '@angular/core';
import { Professionnal } from '../professionnal';
import { CrudService } from '../../services/crud.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-form-professionnal',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule
  ],
  templateUrl: './form-professionnal.component.html',
  styleUrl: './form-professionnal.component.css'
})

export class FormProfessionnalComponent implements OnInit{
  @Input() professionnal: Professionnal;
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
      this.crudService.addProfessionnal(this.professionnal).subscribe((professionnal: Professionnal) => this.router.navigate(['/professionnal', professionnal.id]));
    }else{
      this.crudService.updateProfessionnal(this.professionnal).subscribe(() => this.router.navigate(['/professionnal', this.professionnal.id]));
    }
      
  }
}
