import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

import { CrudService } from '../services/crud.service';
import { HttpClientModule } from '@angular/common/http';
import { EditGunComponent } from './edit-gun/edit-gun.component';
import { ListGunComponent } from './list-gun/list-gun.component';
import { DetailGunComponent } from './detail-gun/detail-gun.component';
import { FormGunComponent } from './form-gun/form-gun.component';
import { AddGunComponent } from './add-gun/add-gun.component';


@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule//????Je dois le mettre où ?
  ],
  declarations: [
    EditGunComponent,
    ListGunComponent,
    DetailGunComponent,
    FormGunComponent,
    AddGunComponent
  ],
  providers: [CrudService]
})

export class GunModule { }
