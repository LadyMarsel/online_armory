import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListLicenseComponent } from './list-license.component';

describe('ListLicenseComponent', () => {
  let component: ListLicenseComponent;
  let fixture: ComponentFixture<ListLicenseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListLicenseComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListLicenseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
