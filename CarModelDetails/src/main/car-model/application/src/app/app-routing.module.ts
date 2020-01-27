import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarListComponent } from './cars-list/car-list.component';
import { CarFormComponent } from './cars-form/car-form.component';

const routes: Routes = [
  { path: 'cars', component: CarListComponent },
  { path: 'addcar', component: CarFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
