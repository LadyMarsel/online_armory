import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormProfessionnalComponent } from './form-professionnal.component';

describe('FormProfessionnalComponent', () => {
  let component: FormProfessionnalComponent;
  let fixture: ComponentFixture<FormProfessionnalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormProfessionnalComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormProfessionnalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
