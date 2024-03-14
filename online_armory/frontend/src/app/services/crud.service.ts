import { Injectable } from '@angular/core';
import { GUNS } from '../gun/mock-guns';
import { Gun } from '../gun/gun';

@Injectable({providedIn: 'root'})
export class CrudService {

  getGunList(): Gun[]{
    return GUNS;
  }

  getGunById(gunId: number): Gun|undefined{
    return GUNS.find(gun => gun.id == gunId);
  }
}
