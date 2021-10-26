import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculoContainerComponent } from './calculo-container.component';

describe('CalculoContainerComponent', () => {
  let component: CalculoContainerComponent;
  let fixture: ComponentFixture<CalculoContainerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalculoContainerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculoContainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
