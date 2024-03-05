import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent {
titre:string ="hello";

public constructor(apiService: ApiService)
{
  apiService.getMembers().subscribe((data: any) => console.log(data));
}
}
