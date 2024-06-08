import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListLicenceTypeComponent } from './list-licence-type.component';

describe('ListLicenceTypeComponent', () => {
  let component: ListLicenceTypeComponent;
  let fixture: ComponentFixture<ListLicenceTypeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListLicenceTypeComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListLicenceTypeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
