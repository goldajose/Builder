package se.saltcode.builder.house_builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.saltcode.builder.house_builder.House;

@SpringBootApplication
public class HouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseApplication.class, args);

        House house = new House.HouseBuilder()
                .setRooms(3)
                .setBathRooms(2)
                .setHasGarage(true)
                .setHasSwimmingPool(false)
                .setHasGarden(true)
                .build();

        System.out.println("Constructed House: " + house);
    }
}

