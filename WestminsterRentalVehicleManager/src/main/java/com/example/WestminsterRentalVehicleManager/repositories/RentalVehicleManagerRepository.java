package com.example.WestminsterRentalVehicleManager.repositories;

import com.example.WestminsterRentalVehicleManager.VehicleManagerModel.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalVehicleManagerRepository extends MongoRepository<Vehicle,String> {
}
