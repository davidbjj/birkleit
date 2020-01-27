import { TestBed, inject } from '@angular/core/testing';

import { CarService as carService } from './car.service';

describe('CarService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [carService]
    });
  });

  it('should be created', inject([carService], (service: carService) => {
    expect(service).toBeTruthy();
  }));
});
