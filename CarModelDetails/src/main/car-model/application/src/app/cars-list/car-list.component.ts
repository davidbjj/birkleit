import { Component, OnInit } from '@angular/core';
import { Car } from '../model/car';
import { CarService } from '../service/car.service';

@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css']
})
export class CarListComponent implements OnInit {

  cars: Car[];

  constructor(private carService: CarService) {

  }

  ngOnInit() {
    this.carService.findAll().subscribe(data => {
      this.cars = data;
    });
  }

  deleteCar(id: number) {
    this.carService.deleteCar(id)
      .subscribe( data => console.log(data);
      this.deleteMessage = true;
      this.carService.findAll().subscribe(data => {this.car=data})
      )
  }, error => console.log(error);
}
 
