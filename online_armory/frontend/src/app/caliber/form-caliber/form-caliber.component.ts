import { Component, Input, OnInit } from '@angular/core';
import { CrudService } from '../../services/crud.service';
import { Caliber } from '../caliber';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-form-caliber',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule
  ],
  templateUrl: './form-caliber.component.html',
  styleUrl: './form-caliber.component.css'
})

export class FormCaliberComponent implements OnInit{
  @Input() caliber: Caliber;
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
      this.crudService.addCaliber(this.caliber).subscribe((caliber: Caliber) => this.router.navigate(['/caliber', caliber.id]));
    }else{
      this.crudService.updateCaliber(this.caliber).subscribe(() => this.router.navigate(['/caliber', this.caliber.id]));
    }
      
  }
}
