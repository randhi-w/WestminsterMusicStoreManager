import {Component,OnInit} from "@angular/core";
import {Vehicle} from "./vehicle";
import {NgForm} from "@angular/forms";
import {VehicleService} from "./vehicle.service"


@Component({
    selector:"vehicle-list",
    templateUrl:"./vehicle-list.component.html"
})

export class VehicleListComponent implements OnInit{
    vehicles:Vehicle[];
    newVehicle: Vehicle = new Vehicle();

    constructor(
        private vehicleService: VehicleService,
    ){}
    
    ngOnInit():void{
        this.vehicleService.myMethod();
    }

    getVehicles(): void{
        this.vehicleService.getVehicles()
            .then(vehicles => this.vehicles = this.vehicles);
    }
}