import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TenantinComponent } from './tenantin.component';

describe('TenantinComponent', () => {
  let component: TenantinComponent;
  let fixture: ComponentFixture<TenantinComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TenantinComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TenantinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
