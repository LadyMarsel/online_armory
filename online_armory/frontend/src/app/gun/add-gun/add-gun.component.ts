import { Component, OnInit } from '@angular/core';
import { Gun } from '../gun';

@Component({
  selector: 'app-add-gun',
  standalone: true,
  imports: [],
  templateUrl: './add-gun.component.html',
  styleUrl: './add-gun.component.css'
})
export class AddGunComponent {
  gun: Gun;

  ngOnInit(){
    this.gun = new Gun();
  }
}
