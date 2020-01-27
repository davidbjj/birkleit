import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Car } from '../model/car';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class CarService {

  private carsUrl: string;

  constructor(private http: HttpClient) {
    this.carsUrl = 'http://localhost:8080/cars';
  }

  public findAll(): Observable<Car[]> {
    return this.http.get<Car[]>(this.carsUrl);
  }

  public save(cars: Car) {
    return this.http.post<Car>(this.carsUrl, cars);
  }

  deleteCar(id: number): Observable<any> {
    console.log('------------------------------------------------------------------------');
    console.log('------------------------------------------------------------------------');
    return this.http.delete(`${this.carsUrl}/${id}`, { responseType: 'text' });
  }
}
