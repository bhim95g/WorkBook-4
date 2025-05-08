package com.pluralsight;

public class Room {
    public class room {

        private int id, numberOfBeds;
        private double price;
        private boolean occupied, dirty;

        public room(int id, int numberOfBeds, double price) {
            this.id = id;
            this.numberOfBeds = numberOfBeds;
            this.price = price;
            this.occupied = false;
            this.dirty = false;
        }

        public double getPrice() {
            return price;
        }

        public boolean isOccupied() {
            return occupied;
        }

        public boolean isDirty() {
            return dirty;
        }

        public int getNumberOfBeds() {
            return numberOfBeds;
        }

        public boolean isAvailable() {
            return (!dirty && !occupied);
        }

        public void checkIn() {
            if (isAvailable()) {
                this.dirty = true;
                this.occupied = true;
            } else {
                System.out.println("Not Available");
            }
        }

        public void checkOut() {
            this.occupied = false;
        }

        public void cleanRoom() {
            this.dirty = false;
        }
    }
}

