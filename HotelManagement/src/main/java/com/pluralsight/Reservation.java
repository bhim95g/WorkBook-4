package com.pluralsight;

public class Reservation {
    private String RoomType;
    private double price;
    private int NumberOfNights;
    private boolean isWeekend;


    //Constructor
    public Reservation(String RoomType, double price, int NumberOfNight, boolean isWeekend) {
        this.RoomType = RoomType;
        this.price = price;
        this.NumberOfNights = NumberOfNight;
        this.isWeekend = isWeekend;

        setPricePerNight(); //Calculate price base on room type and weekend stay
    }

    //Set price per night base on room type and isWeekend
    public void setPricePerNight() {
        if (RoomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (RoomType.equalsIgnoreCase("double")) {
            price = 124.00;
        } else {
            price = 0.0; //please put valid input
        }
        if (isWeekend) {
            price *= 1.10; // 10% increase from the original price

        }
    }

    //Getter and Setter
    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
        setPricePerNight(); //Recalculate price when room type changes
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

    public double getReservationTotal() {
        return price * NumberOfNights;
    }
}
