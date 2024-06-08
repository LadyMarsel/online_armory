import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailLicenceTypeComponent } from './detail-licence-type.component';

describe('DetailLicenceTypeComponent', () => {
  let component: DetailLicenceTypeComponent;
  let fixture: ComponentFixture<DetailLicenceTypeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DetailLicenceTypeComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DetailLicenceTypeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
