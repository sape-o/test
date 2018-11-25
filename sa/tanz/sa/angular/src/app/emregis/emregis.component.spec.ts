import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmregisComponent } from './emregis.component';

describe('EmregisComponent', () => {
  let component: EmregisComponent;
  let fixture: ComponentFixture<EmregisComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmregisComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmregisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
