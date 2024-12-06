import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisterUnderWriterComponent } from './register-under-writer.component';

describe('RegisterUnderWriterComponent', () => {
  let component: RegisterUnderWriterComponent;
  let fixture: ComponentFixture<RegisterUnderWriterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [RegisterUnderWriterComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegisterUnderWriterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
