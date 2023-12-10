import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FindbyroleComponent } from './findbyrole.component';

describe('FindbyroleComponent', () => {
  let component: FindbyroleComponent;
  let fixture: ComponentFixture<FindbyroleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FindbyroleComponent]
    });
    fixture = TestBed.createComponent(FindbyroleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
