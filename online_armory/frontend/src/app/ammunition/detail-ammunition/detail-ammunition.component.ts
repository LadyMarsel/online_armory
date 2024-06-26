import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ActivatedRoute, Router } from '@angular/router';

import { Ammunition } from '../ammunition';
import { CrudService } from '../../services/crud.service';


@Component({
  selector: 'app-detail-ammunition',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './detail-ammunition.component.html',
  styleUrl: './detail-ammunition.component.css'
})

export class DetailAmmunitionComponent implements OnInit {
  ammunitionsList: Ammunition[];
  ammunition: Ammunition|undefined;

  constructor(
    private route: ActivatedRoute, 
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit() {
    const ammunitionId: string|null = this.route.snapshot.paramMap.get('id'); //Permet d'acceder à l'url à un instant T
    if(ammunitionId){
      this.crudService.getAmmunitionById(+ammunitionId).subscribe(data => this.ammunition = data);
    }
  }

  goToAmmunitionsList(){
    this.router.navigate(['/ammunitions']);
  }

  goToEditAmmunition(ammunition: Ammunition) {
    this.router.navigate(['/edit/ammunition', ammunition.id]);
  }

  deleteAmmunition(ammunition: Ammunition) {
    this.crudService.deleteAmmunitionById(ammunition.id).subscribe(() => this.goToAmmunitionsList());
  }

}

