import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormCaliberComponent } from './form-caliber.component';

describe('FormCaliberComponent', () => {
  let component: FormCaliberComponent;
  let fixture: ComponentFixture<FormCaliberComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormCaliberComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormCaliberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
