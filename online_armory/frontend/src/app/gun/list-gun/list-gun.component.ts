import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';

import { Gun } from '../gun';
import { CrudService } from '../../services/crud.service';


@Component({
  selector: 'app-list-gun',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './list-gun.component.html',
  styleUrl: './list-gun.component.css'
})

export class ListGunComponent implements OnInit {
  gunList: Gun[];

  constructor(
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit(){
    this.gunList = this.crudService.getGunList();
  }

  goToGun(gun: Gun){
    this.router.navigate(['/gun', gun.id]);
  }

}
