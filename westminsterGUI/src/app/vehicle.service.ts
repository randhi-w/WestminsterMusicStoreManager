import {Injectable} from "@angular/core";
import {Vehicle} from "./vehicle";
import {Http} from "@angular/http";


@Injectable()
export class VehicleService{
    private baseUrl = "http://localhost:8082";

    constructor(private http:Http){}


    getVehicles(): Promise<Vehicle[]> {
        return this.http.get(this.baseUrl+"/api/vehicles/")
        .toPromise()
        .then(Response => Response.json() as Vehicle[]);
    
    }
    myMethod(){
        return console.log("wprlomg");
    }


}