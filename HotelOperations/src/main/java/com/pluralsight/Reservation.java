package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int NumberOfNights;
    private boolean isWeekend;

    Reservation(String roomType, double price, int NumberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.NumberOfNights = NumberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return NumberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        NumberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;

    }
}
