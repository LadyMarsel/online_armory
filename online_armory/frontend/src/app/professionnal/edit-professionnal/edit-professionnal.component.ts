import { Component, OnInit } from '@angular/core';
import { Professionnal } from '../professionnal';
import { ActivatedRoute } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';
import { FormProfessionnalComponent } from '../form-professionnal/form-professionnal.component';

@Component({
  selector: 'app-edit-professionnal',
  standalone: true,
  imports: [
    CommonModule,
    FormProfessionnalComponent
  ],
  templateUrl: './edit-professionnal.component.html',
  styleUrl: './edit-professionnal.component.css'
})

export class EditProfessionnalComponent implements OnInit {

  professionnal: Professionnal|undefined;

  constructor(
    private route: ActivatedRoute,
    private crudService: CrudService,
  ){}

  ngOnInit() {
      const professionnalId: string|null = this.route.snapshot.paramMap.get('id');
      if(professionnalId){
        this.crudService.getProfessionnalById(+professionnalId).subscribe(data => this.professionnal = data);
      }else{
        this.professionnal = undefined;
      }
  }
}