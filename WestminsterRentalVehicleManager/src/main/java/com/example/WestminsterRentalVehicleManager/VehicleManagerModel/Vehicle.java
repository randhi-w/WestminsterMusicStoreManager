package com.example.WestminsterRentalVehicleManager.VehicleManagerModel;

import dev.morphia.annotations.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

@Document(collation = "vehicles")
@Entity
public class Vehicle {



    @Id
    private String plateNumber;

    @Field
    private String make;
    @Field
    private String model;

    public Vehicle(String plateNumber, String make, String model) {
        this.plateNumber = plateNumber;

    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }



}
