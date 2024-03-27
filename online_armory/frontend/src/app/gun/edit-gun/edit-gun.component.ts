import { Component, OnInit } from '@angular/core';
import { Gun } from '../gun';
import { ActivatedRoute } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';
import { FormGunComponent } from '../form-gun/form-gun.component';

@Component({
  selector: 'app-edit-gun',
  standalone: true,
  imports: [
    CommonModule,
    FormGunComponent
],
  templateUrl: './edit-gun.component.html',
  styleUrl: './edit-gun.component.css'
})
export class EditGunComponent implements OnInit {

  gun: Gun|undefined;

  constructor(
    private route: ActivatedRoute,
    private crudService: CrudService,
  ){}

  ngOnInit(): void {
      const gunId: string|null = this.route.snapshot.paramMap.get('id');
      if(gunId){
        this.crudService.getGunById(+gunId).subscribe(data => this.gun = data);
      }else{
        this.gun = undefined;
      }
  }

}
