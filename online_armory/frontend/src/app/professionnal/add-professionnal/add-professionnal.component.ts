import { Component } from '@angular/core';
import { Professionnal } from '../professionnal';
import { FormProfessionnalComponent } from '../form-professionnal/form-professionnal.component';

@Component({
  selector: 'app-add-professionnal',
  standalone: true,
  imports: [
    FormProfessionnalComponent
  ],
  templateUrl: './add-professionnal.component.html',
  styleUrl: './add-professionnal.component.css'
})

export class AddProfessionnalComponent {
  professionnal: Professionnal;

  ngOnInit(){
    this.professionnal = new Professionnal();
  }
}