import { Component, OnInit } from '@angular/core';
import { Caliber } from '../caliber';
import { Router } from '@angular/router';
import { CrudService } from '../../services/crud.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-list-caliber',
  standalone: true,
  imports: [
    CommonModule
  ],
  templateUrl: './list-caliber.component.html',
  styleUrl: './list-caliber.component.css'
})

export class ListCaliberComponent implements OnInit {
  calibersList: Caliber[];

  constructor(
    private router: Router,
    private crudService: CrudService
    ){}

  ngOnInit(){
  this.crudService.getCalibersList().subscribe(data => this.calibersList = data);
  }

  goToAddCaliber() {
    this.router.navigate(['/caliber/add']);
  }

  deleteCaliber(caliber: Caliber) {
    this.crudService.deleteCaliberById(caliber.id).subscribe(() => this.goToCalibersList());
    this.router.navigate(['/calibers']);
  }

  goToCalibersList(){
    this.router.navigate(['/calibers']);
  }

  goToEditCaliber(caliber: Caliber) {
    this.router.navigate(['/edit/caliber', caliber.id]);
  }
}

