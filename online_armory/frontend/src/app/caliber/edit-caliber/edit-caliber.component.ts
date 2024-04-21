import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { Caliber } from '../caliber';
import { CommonModule } from '@angular/common';
import { FormCaliberComponent } from '../form-caliber/form-caliber.component';

@Component({
  selector: 'app-edit-caliber',
  standalone: true,
  imports: [
    CommonModule,
    FormCaliberComponent
  ],
  templateUrl: './edit-caliber.component.html',
  styleUrl: './edit-caliber.component.css'
})

export class EditCaliberComponent implements OnInit {

  caliber: Caliber|undefined;

  constructor(
    private route: ActivatedRoute,
    private crudService: CrudService,
  ){}

  ngOnInit() {
      const caliberId: string|null = this.route.snapshot.paramMap.get('id');
      if(caliberId){
        this.crudService.getCaliberById(+caliberId).subscribe(data => this.caliber = data);
      }else{
        this.caliber = undefined;
      }
  }

}
