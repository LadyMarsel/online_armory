import { Component } from '@angular/core';
import { Caliber } from '../caliber';
import { FormCaliberComponent } from '../form-caliber/form-caliber.component';

@Component({
  selector: 'app-add-caliber',
  standalone: true,
  imports: [
    FormCaliberComponent
  ],
  templateUrl: './add-caliber.component.html',
  styleUrl: './add-caliber.component.css'
})

export class AddCaliberComponent {
  caliber: Caliber;

  ngOnInit(){
    this.caliber = new Caliber();
  }
}
