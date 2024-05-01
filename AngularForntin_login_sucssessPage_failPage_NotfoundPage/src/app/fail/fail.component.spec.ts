import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FailComponent } from './fail.component';

describe('FailComponent', () => {
  let component: FailComponent;
  let fixture: ComponentFixture<FailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FailComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
