import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailGunComponent } from './detail-gun.component';

describe('DetailGunComponent', () => {
  let component: DetailGunComponent;
  let fixture: ComponentFixture<DetailGunComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DetailGunComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DetailGunComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
