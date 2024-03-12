import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ActivatedRoute, Router } from '@angular/router';
import { Gun } from '../gun';
import { GUNS } from '../mock-guns';

@Component({
  selector: 'app-detail-gun',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './detail-gun.component.html',
  styleUrl: './detail-gun.component.css'
})
export class DetailGunComponent implements OnInit {

  gunList: Gun[] = GUNS;
  gun: Gun|undefined;

  constructor(private route: ActivatedRoute, private router: Router){}

  ngOnInit() {
    this.gunList = GUNS;
    const gunId: string|null = this.route.snapshot.paramMap.get('id'); //Permet d'acceder à l'url à un instant T
    
    if(gunId){
      this.gun = this.gunList.find(gun => gun.id == +gunId);
    }else{
      this.gun = undefined;
    }
  }

  goToGunList(){
    this.router.navigate(['/guns']);
  }

}
