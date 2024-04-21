import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListProfessionnalComponent } from './list-professionnal.component';

describe('ListProfessionnalComponent', () => {
  let component: ListProfessionnalComponent;
  let fixture: ComponentFixture<ListProfessionnalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListProfessionnalComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListProfessionnalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
