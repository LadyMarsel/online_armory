import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailAmmunitionComponent } from './detail-ammunition.component';

describe('DetailAmmunitionComponent', () => {
  let component: DetailAmmunitionComponent;
  let fixture: ComponentFixture<DetailAmmunitionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DetailAmmunitionComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DetailAmmunitionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
