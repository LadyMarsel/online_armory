import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListCaliberComponent } from './list-caliber.component';

describe('ListCaliberComponent', () => {
  let component: ListCaliberComponent;
  let fixture: ComponentFixture<ListCaliberComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListCaliberComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListCaliberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
