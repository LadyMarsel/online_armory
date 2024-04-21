import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormAmmunitionComponent } from './form-ammunition.component';

describe('FormAmmunitionComponent', () => {
  let component: FormAmmunitionComponent;
  let fixture: ComponentFixture<FormAmmunitionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormAmmunitionComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormAmmunitionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
