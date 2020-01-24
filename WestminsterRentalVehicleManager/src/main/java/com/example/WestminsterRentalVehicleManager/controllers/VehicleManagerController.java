package com.example.WestminsterRentalVehicleManager.controllers;


import com.example.WestminsterRentalVehicleManager.VehicleManagerModel.Vehicle;
import com.example.WestminsterRentalVehicleManager.repositories.RentalVehicleManagerRepository;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class VehicleManagerController {

    @Autowired
    RentalVehicleManagerRepository rentalVehicleManagerRepository;

    @GetMapping("/vehicles")
    public List<Vehicle> getAllVehicles(){
        return rentalVehicleManagerRepository.findAll(); //must fix
    }


    @PostMapping
    public Vehicle createVehicle(@Valid @RequestBody Vehicle vehicle){
        return rentalVehicleManagerRepository.save(vehicle);
    }

    @GetMapping(value = "/vehicles/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable("id") String id){
        return rentalVehicleManagerRepository.findById(id)
                .map(vehicle -> ResponseEntity.ok().body(vehicle))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value = "/vehicles/{id}")
    public ResponseEntity<?> deleteVehicle(@PathVariable("id") String id){
        return rentalVehicleManagerRepository.findById(id)
                .map(vehicle -> {
                    rentalVehicleManagerRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
