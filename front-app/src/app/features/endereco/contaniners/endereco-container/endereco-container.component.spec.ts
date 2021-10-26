import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnderecoContainerComponent } from './endereco-container.component';

describe('EnderecoContainerComponent', () => {
  let component: EnderecoContainerComponent;
  let fixture: ComponentFixture<EnderecoContainerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnderecoContainerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EnderecoContainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
