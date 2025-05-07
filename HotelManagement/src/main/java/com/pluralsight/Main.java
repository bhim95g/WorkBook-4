package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Room
        Room room = new Room(2, 150.00, false, false, true);
        System.out.printf("Room: %d beds, $%.2f/night, available? %b%n",
                room.getNumberOfBeds(),
                room.getPrice(),
                room.isAvailable());

        // Reservation roomType king for 2 nights and is available
        Reservation weekendKing = new Reservation("king", 149, 2, room.isAvailable());
        System.out.printf("Reservation: %s room, $%.2f/night, total $%.2f%n",
                weekendKing.getRoomType(),
                weekendKing.getPrice(),
                weekendKing.getReservationTotal());

        // Employee payRoll
        Employee emp = new Employee("E101", "Dana White", "Sales", 22.50, 47);
        System.out.printf("Employee %s (%s)%n  Dept: %s%n  Hours: %.1f (Reg: %.1f, OT: %.1f)%n"
                        + "  Rate: $%.2f → Total Pay: $%.2f%n",
                emp.getName(), emp.getEmployeeId(),
                emp.getDepartment(),
                emp.getHoursWorked(),
                emp.getRegularHours(), emp.getOverTimeHours(),
                emp.getPayRate(), emp.getTotalPay());

    }
}
