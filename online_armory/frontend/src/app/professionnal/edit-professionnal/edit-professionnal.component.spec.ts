import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditProfessionnalComponent } from './edit-professionnal.component';

describe('EditProfessionnalComponent', () => {
  let component: EditProfessionnalComponent;
  let fixture: ComponentFixture<EditProfessionnalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EditProfessionnalComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EditProfessionnalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
