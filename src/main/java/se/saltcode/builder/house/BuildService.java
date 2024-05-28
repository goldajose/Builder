package se.saltcode.builder.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import se.saltcode.builder.features.Garage;
import se.saltcode.builder.features.Garden;
import se.saltcode.builder.features.Pool;
import se.saltcode.builder.types.HouseType;

@Service
public class BuildService {

    @Autowired
    private ApplicationContext context;

    /*public BuildService(ApplicationContext context) {
        this.context = context;
    }*/

    public House.BuildHouse builder() {
        return context.getBean(House.BuildHouse.class);
    }

    public House buildCustomHouse() {
        return builder().
                setType(HouseType.VILLA)
                .setAddress("östermalmsgatan 15")
                .addFeature(new Pool())
                .addFeature(new Garden())
                .addFeature(new Garage())
                .build();
    }
}
