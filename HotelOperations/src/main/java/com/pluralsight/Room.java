package com.pluralsight;

public class Room {
    private int beds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    Room(int beds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.beds = beds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }
    //Getters
    public int getNumberOfBeds() {
        return this.beds;
    }
    public double getPrice() {
        return this.price;
    }
    public boolean getIsOccupied() {
        return this.isOccupied;

    }
    public boolean getIsDirty() {
        return this.isDirty;
    }
    public boolean getIsAvailable() {
        return this.isAvailable;
    }
    //Methods
    public boolean isAvailable() {
        return !isOccupied && !isDirty;



    }

}
