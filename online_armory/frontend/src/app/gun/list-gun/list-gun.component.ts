import { Component } from '@angular/core';
import { Gun } from '../gun';
import { GUNS } from '../mock-guns';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { BorderCardDirective } from '../../directive/border-card.directive';
import { ResizeImageDirective } from '../../directive/resize-image.directive';

@Component({
  selector: 'app-list-gun',
  standalone: true,
  imports: [
    CommonModule,
    BorderCardDirective,
    ResizeImageDirective
  ],
  templateUrl: './list-gun.component.html',
  styleUrl: './list-gun.component.css'
})
export class ListGunComponent {

  gunList: Gun[] = GUNS;

  constructor(private router: Router){}

  goToGun(gun: Gun){
    this.router.navigate(['/gun', gun.id]);
  }

}
