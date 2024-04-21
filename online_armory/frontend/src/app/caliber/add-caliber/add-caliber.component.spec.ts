import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCaliberComponent } from './add-caliber.component';

describe('AddCaliberComponent', () => {
  let component: AddCaliberComponent;
  let fixture: ComponentFixture<AddCaliberComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddCaliberComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddCaliberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
