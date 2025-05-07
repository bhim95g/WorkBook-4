package com.pluralsight;

public class Room {
    private int NumberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;
//Constructor
    public Room(int NumberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.NumberOfBeds = NumberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }
//Getter
    public int getNumberOfBeds() {
        return this.NumberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
            return isAvailable;
    }
}
