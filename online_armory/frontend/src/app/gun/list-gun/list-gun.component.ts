import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';

import { Gun } from '../gun';
import { CrudService } from '../../services/crud.service';


@Component({
  selector: 'app-list-gun',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './list-gun.component.html',
  styleUrl: './list-gun.component.css'
})

export class ListGunComponent implements OnInit {
  gunsList: Gun[];

  constructor(
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit(){
  this.crudService.getGunsList().subscribe(data => this.gunsList = data);
  }

  goToGun(gun: Gun){
    this.router.navigate(['/gun', gun.id]);
  }

  goToAddGun() {
    this.router.navigate(['/gun/add']);
  }

}
