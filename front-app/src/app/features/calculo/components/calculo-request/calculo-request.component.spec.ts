import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculoRequestComponent } from './calculo-request.component';

describe('CalculoRequestComponent', () => {
  let component: CalculoRequestComponent;
  let fixture: ComponentFixture<CalculoRequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalculoRequestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculoRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
