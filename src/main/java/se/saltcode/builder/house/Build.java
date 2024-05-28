package se.saltcode.builder.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.saltcode.builder.features.Garage;
import se.saltcode.builder.features.Garden;
import se.saltcode.builder.features.Pool;
import se.saltcode.builder.types.HouseType;

@SpringBootApplication
public class Build {
    public static void main(String[] args) {
        SpringApplication.run(Build.class, args);

        House.BuildHouse builder = new House.BuildHouse();

        House house = builder
                .setType(HouseType.VILLA)
                .setAddress("östermalmsgatan 15")
                .addFeature(new Pool())
                .addFeature(new Garden())
                .build();

        System.out.println("Constructed House: " + house);
    }
}
