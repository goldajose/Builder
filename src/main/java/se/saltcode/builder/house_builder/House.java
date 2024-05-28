package se.saltcode.builder.house_builder;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class House {
    private final int rooms;
    private final int bathRooms;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasGarden;


    private House(int rooms, int bathRooms, boolean hasGarage,
                  boolean hasSwimmingPool, boolean hasGarden) {
        this.rooms = rooms;
        this.bathRooms = bathRooms;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;

    }

    public int getRooms() {
        return rooms;
    }

    public int getBathRooms() {
        return bathRooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    @Component
    public static class HouseBuilder {
        private int rooms;
        private int bathRooms;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setBathRooms(int bathRooms) {
            this.bathRooms = bathRooms;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(rooms, bathRooms, hasGarage, hasSwimmingPool, hasGarden);
        }

    }
}
