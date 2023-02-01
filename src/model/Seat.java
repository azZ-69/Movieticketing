package model;

public class Seat {
    String seatNumber;

    Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    void addSeatInfo() {
        System.out.println("Seat Number: " + seatNumber);
    }
}
