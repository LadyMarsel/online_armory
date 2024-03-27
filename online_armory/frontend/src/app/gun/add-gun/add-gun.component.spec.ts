import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddGunComponent } from './add-gun.component';

describe('AddGunComponent', () => {
  let component: AddGunComponent;
  let fixture: ComponentFixture<AddGunComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddGunComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddGunComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
