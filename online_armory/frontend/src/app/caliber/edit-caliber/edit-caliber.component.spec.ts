import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditCaliberComponent } from './edit-caliber.component';

describe('EditCaliberComponent', () => {
  let component: EditCaliberComponent;
  let fixture: ComponentFixture<EditCaliberComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EditCaliberComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EditCaliberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
