import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnderecoRequestComponent } from './endereco-request.component';

describe('EnderecoRequestComponent', () => {
  let component: EnderecoRequestComponent;
  let fixture: ComponentFixture<EnderecoRequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnderecoRequestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EnderecoRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
