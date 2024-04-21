import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormGunComponent } from './form-gun.component';

describe('FormGunComponent', () => {
  let component: FormGunComponent;
  let fixture: ComponentFixture<FormGunComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormGunComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormGunComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
