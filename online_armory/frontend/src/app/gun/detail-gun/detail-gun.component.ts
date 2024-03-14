import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CommonModule } from '@angular/common';

import { Gun } from '../gun';
import { CrudService } from '../../services/crud.service';


@Component({
  selector: 'app-detail-gun',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './detail-gun.component.html',
  styleUrl: './detail-gun.component.css'
})

export class DetailGunComponent implements OnInit {
  gunList: Gun[];
  gun: Gun|undefined;

  constructor(
    private route: ActivatedRoute, 
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit() {
    const gunId: string|null = this.route.snapshot.paramMap.get('id'); //Permet d'acceder à l'url à un instant T
    if(gunId){
      this.gun = this.crudService.getGunById(+gunId);
    }
  }

  goToGunList(){
    this.router.navigate(['/guns']);
  }

}
