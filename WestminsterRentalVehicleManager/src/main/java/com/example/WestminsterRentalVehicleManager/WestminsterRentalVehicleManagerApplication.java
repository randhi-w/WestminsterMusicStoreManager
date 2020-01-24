package com.example.WestminsterRentalVehicleManager;


import com.example.WestminsterRentalVehicleManager.VehicleManagerModel.Vehicle;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class WestminsterRentalVehicleManagerApplication {


	public static void main(String[] args) {


		SpringApplication.run(WestminsterRentalVehicleManagerApplication.class, args);

	}

}
