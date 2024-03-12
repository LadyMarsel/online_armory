import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListGunComponent } from './gun/list-gun/list-gun.component';
import { DetailGunComponent } from './gun/detail-gun/detail-gun.component';


export const routes: Routes = [
    { path: 'gun/:id', component: DetailGunComponent },
    { path: 'guns', component: ListGunComponent },
    { path: '', redirectTo: 'guns', pathMatch: 'full' }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}
