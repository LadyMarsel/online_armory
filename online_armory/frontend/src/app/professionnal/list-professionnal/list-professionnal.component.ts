import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Professionnal } from '../professionnal';
import { Router } from '@angular/router';
import { CrudService } from '../../services/crud.service';

@Component({
  selector: 'app-list-professionnal',
  standalone: true,
  imports: [
    CommonModule,
  ],
  templateUrl: './list-professionnal.component.html',
  styleUrl: './list-professionnal.component.css'
})
export class ListProfessionnalComponent {
  professionnalsList: Professionnal[];

  constructor(
    private router: Router,
    private crudService: CrudService
  ){}

  ngOnInit(){
    this.crudService.getProfessionnalsList().subscribe(data => this.professionnalsList = data);
    }

  goToAddProfessionnal() {
    this.router.navigate(['/professionnal/add']);
  }

  deleteProfessionnal(professionnal: Professionnal) {
    this.crudService.deleteProfessionnalById(professionnal.id).subscribe(() => this.goToProfessionnalsList());
  }

  goToProfessionnalsList(){
    this.router.navigate(['/professionnals']);
  }

  goToEditProfessionnal(professionnal: Professionnal) {
    this.router.navigate(['/edit/professionnal', professionnal.id]);
  }
}
