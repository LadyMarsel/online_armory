import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddProfessionnalComponent } from './add-professionnal.component';

describe('AddProfessionnalComponent', () => {
  let component: AddProfessionnalComponent;
  let fixture: ComponentFixture<AddProfessionnalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddProfessionnalComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddProfessionnalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
