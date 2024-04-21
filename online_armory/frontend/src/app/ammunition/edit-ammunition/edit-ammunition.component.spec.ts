import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditAmmunitionComponent } from './edit-ammunition.component';

describe('EditAmmunitionComponent', () => {
  let component: EditAmmunitionComponent;
  let fixture: ComponentFixture<EditAmmunitionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EditAmmunitionComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EditAmmunitionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
