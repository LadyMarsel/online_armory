import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

import { CrudService } from '../../services/crud.service';
import { Ammunition } from '../ammunition';

@Component({
  selector: 'app-list-ammunition',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './list-ammunition.component.html',
  styleUrl: './list-ammunition.component.css'
})

export class ListAmmunitionComponent implements OnInit{
  ammunitionsList: Ammunition[] = [];
  startIndex: number = 0;

  constructor(
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit(){
    this.crudService.getAmmunitionsList().subscribe(data => this.ammunitionsList = data);
  }

  goToAmmunition(ammunition: Ammunition){
    this.router.navigate(['/ammunition', ammunition.id]);
  }

  goToAddAmmunition() {
    this.router.navigate(['/ammunition/add']);
  }

  goToLeft(){
    if(this.startIndex == 0){
      this.startIndex=this.ammunitionsList.length-1;
    }else{
    this.startIndex--;
    }
  }

  goToRight(){
    this.startIndex = (this.startIndex+1)%this.ammunitionsList.length;
  }

}
