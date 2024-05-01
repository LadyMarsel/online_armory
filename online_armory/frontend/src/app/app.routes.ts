import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DetailGunComponent } from './gun/detail-gun/detail-gun.component';
import { ListGunComponent } from './gun/list-gun/list-gun.component';
import { DetailCompanyComponent } from './company/detail-company/detail-company.component';
import { ListCompanyComponent } from './company/list-company/list-company.component';
import { DetailAmmunitionComponent } from './ammunition/detail-ammunition/detail-ammunition.component';
import { ListAmmunitionComponent } from './ammunition/list-ammunition/list-ammunition.component';
import { EditGunComponent } from './gun/edit-gun/edit-gun.component';
import { AddGunComponent } from './gun/add-gun/add-gun.component';
import { EditCompanyComponent } from './company/edit-company/edit-company.component';
import { AddCompanyComponent } from './company/add-company/add-company.component';
import { AddAmmunitionComponent } from './ammunition/add-ammunition/add-ammunition.component';
import { EditAmmunitionComponent } from './ammunition/edit-ammunition/edit-ammunition.component';
import { EditCaliberComponent } from './caliber/edit-caliber/edit-caliber.component';
import { ListCaliberComponent } from './caliber/list-caliber/list-caliber.component';
import { AddCaliberComponent } from './caliber/add-caliber/add-caliber.component';
import { EditProfessionnalComponent } from './professionnal/edit-professionnal/edit-professionnal.component';
import { AddProfessionnalComponent } from './professionnal/add-professionnal/add-professionnal.component';
import { ListProfessionnalComponent } from './professionnal/list-professionnal/list-professionnal.component';

export const routes: Routes = [
    /*GUN */
    { path: 'edit/gun/:id', component: EditGunComponent},
    { path: 'gun/add', component: AddGunComponent},
    { path: 'gun/:id', component: DetailGunComponent },
    { path: 'guns', component: ListGunComponent },
    /*COMPANY*/
    { path: 'edit/company/:id', component: EditCompanyComponent},
    { path: 'company/add', component: AddCompanyComponent},
    { path: 'company/:id', component: DetailCompanyComponent},
    { path: 'companies', component: ListCompanyComponent},
    /*AMMUNNITION*/
    { path: 'edit/ammunition/:id', component: EditAmmunitionComponent},
    { path: 'ammunition/add', component: AddAmmunitionComponent},
    { path: 'ammunition/:id', component: DetailAmmunitionComponent},
    { path: 'ammunitions', component: ListAmmunitionComponent},
    /*CALIBER*/
    { path: 'edit/caliber/:id', component: EditCaliberComponent},
    { path: 'caliber/add', component: AddCaliberComponent},
    { path: 'calibers', component: ListCaliberComponent},
    /*PROFESSIONAL*/
    { path: 'edit/professionnal/:id', component: EditProfessionnalComponent},
    { path: 'professionnal/add', component: AddProfessionnalComponent},
    { path: 'professionnals', component: ListProfessionnalComponent},

    { path: '', redirectTo: 'guns', pathMatch: 'full' }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}
