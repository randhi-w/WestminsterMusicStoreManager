package com.example.WestminsterRentalVehicleManager;


import com.example.WestminsterRentalVehicleManager.VehicleManagerModel.Vehicle;
import com.example.WestminsterRentalVehicleManager.repositories.RentalVehicleManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ApplicationStartupRunner extends SpringBootServletInitializer implements CommandLineRunner {
    @Autowired
    RentalVehicleManagerRepository rentalVehicleManagerRepository;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationStartupRunner.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStartupRunner.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");
        System.out.println(rentalVehicleManagerRepository);
        Vehicle v1 = new Vehicle("sgs","gsg","gsg");
        rentalVehicleManagerRepository.save(v1);
        System.out.println(rentalVehicleManagerRepository.findAll());

    }
}
