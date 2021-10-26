import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculoResponseComponent } from './calculo-response.component';

describe('CalculoResponseComponent', () => {
  let component: CalculoResponseComponent;
  let fixture: ComponentFixture<CalculoResponseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalculoResponseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculoResponseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
