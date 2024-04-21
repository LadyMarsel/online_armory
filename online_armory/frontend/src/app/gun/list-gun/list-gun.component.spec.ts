import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListGunComponent } from './list-gun.component';

describe('ListGunComponent', () => {
  let component: ListGunComponent;
  let fixture: ComponentFixture<ListGunComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListGunComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListGunComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
