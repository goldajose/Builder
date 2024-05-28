package se.saltcode.builder.house;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import se.saltcode.builder.features.HouseFeatures;
import se.saltcode.builder.types.HouseType;

import java.util.ArrayList;
import java.util.List;


@Scope("prototype")
public class House {
        private final HouseType type;
        private final String address;
        private final List<HouseFeatures> features;

        public House(HouseType type, String address, List<HouseFeatures> features) {
            this.type = type;
            this.address = address;
            this.features = features;
        }

        public HouseType getType() {
            return type;
        }

        public String getAddress() {
            return address;
        }

        public List<HouseFeatures> getFeatures() {
            return features;
        }

        public String list() {
            String list = "[";
            for (var item: features) {
                list += item.getFeatureName() + ", ";
            }
            list = list.substring(0, list.length() - 2);
            list += "]";
            return list;
        }

        @Override
        public String toString() {
            return "House{" +
                    "type=" + type +
                    ", address='" + address + '\'' +
                    ", features=" + list();
        }

    @Component
    @Scope("prototype")
    public static class BuildHouse {

        private HouseType type;
        private String address;
        private final List<HouseFeatures> features = new ArrayList<>();

        public BuildHouse setType(HouseType type) {
            this.type = type;
            return this;
        }

        public BuildHouse setAddress(String address) {
            this.address = address;
            return this;
        }

        public BuildHouse addFeature(HouseFeatures feature) {
            this.features.add(feature);
            return this;
        }

        public House build() {
            return new House(type, address, new ArrayList<>(features));
        }
    }

}
