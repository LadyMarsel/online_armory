import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddAmmunitionComponent } from './add-ammunition.component';

describe('AddAmmunitionComponent', () => {
  let component: AddAmmunitionComponent;
  let fixture: ComponentFixture<AddAmmunitionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddAmmunitionComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddAmmunitionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
