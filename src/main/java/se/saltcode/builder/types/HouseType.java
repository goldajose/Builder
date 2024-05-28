package se.saltcode.builder.types;

public enum HouseType {

    COTTAGE("Cottage"),
    VILLA("Villa"),
    APARTMENT("Apartment");
    private String typeName;

    HouseType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

}
