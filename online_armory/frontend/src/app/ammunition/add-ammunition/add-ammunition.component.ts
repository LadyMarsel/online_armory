import { Component } from '@angular/core';
import { FormAmmunitionComponent } from '../form-ammunition/form-ammunition.component';
import { Ammunition } from '../ammunition';

@Component({
  selector: 'app-add-ammunition',
  standalone: true,
  imports: [
    FormAmmunitionComponent
  ],
  templateUrl: './add-ammunition.component.html',
  styleUrl: './add-ammunition.component.css'
})

export class AddAmmunitionComponent {
  ammunition: Ammunition;

  ngOnInit(){
    this.ammunition = new Ammunition();
  }

}
