import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormCompanyComponent } from './form-company.component';

describe('FormCompanyComponent', () => {
  let component: FormCompanyComponent;
  let fixture: ComponentFixture<FormCompanyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormCompanyComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormCompanyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
