import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CommonModule } from '@angular/common';

import { Gun } from '../gun';
import { CrudService } from '../../services/crud.service';


@Component({
  selector: 'app-detail-gun',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './detail-gun.component.html',
  styleUrl: './detail-gun.component.css'
})

export class DetailGunComponent implements OnInit {
  gunsList: Gun[];
  gun: Gun|undefined;

  constructor(
    private route: ActivatedRoute, 
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit() {
    const gunId: string|null = this.route.snapshot.paramMap.get('id'); //Permet d'acceder à l'url à un instant T
    if(gunId){
      this.crudService.getGunById(+gunId).subscribe(data => this.gun = data);
    }
  }

  goToGunsList(){
    this.router.navigate(['/guns']);
  }

  
  goToEditGun(gun: Gun) {
    this.router.navigate(['/edit/gun', gun.id]);
  }

  deleteGun(gun: Gun) {
    this.crudService.deleteGunById(gun.id).subscribe(() => this.goToGunsList());
  }

}
