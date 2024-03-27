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

export const routes: Routes = [
    { path: 'edit/gun/:id', component: EditGunComponent},
    { path: 'gun/add', component: AddGunComponent},
    { path: 'gun/:id', component: DetailGunComponent },
    { path: 'guns', component: ListGunComponent },
    { path: 'company/:id', component: DetailCompanyComponent},
    { path: 'companies', component: ListCompanyComponent},
    { path: 'ammunition/:id', component: DetailAmmunitionComponent},
    { path: 'ammunitions', component: ListAmmunitionComponent},
    { path: '', redirectTo: 'guns', pathMatch: 'full' }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}
