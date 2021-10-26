import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnderecoResponseComponent } from './endereco-response.component';

describe('EnderecoResponseComponent', () => {
  let component: EnderecoResponseComponent;
  let fixture: ComponentFixture<EnderecoResponseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnderecoResponseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EnderecoResponseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
