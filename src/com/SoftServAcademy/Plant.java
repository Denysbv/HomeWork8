package com.SoftServAcademy;

public class Plant {
    private int size;
    private PlantColor color;
    private PlantType type;

    public Plant(int size, PlantColor color, PlantType type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public PlantColor getColor() {
        return color;
    }

    public PlantType getType() {
        return type;
    }
}
