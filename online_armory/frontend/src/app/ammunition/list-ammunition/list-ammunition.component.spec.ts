import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListAmmunitionComponent } from './list-ammunition.component';

describe('ListAmmunitionComponent', () => {
  let component: ListAmmunitionComponent;
  let fixture: ComponentFixture<ListAmmunitionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListAmmunitionComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListAmmunitionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
