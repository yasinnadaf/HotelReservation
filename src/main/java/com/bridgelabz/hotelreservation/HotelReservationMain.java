package com.bridgelabz.hotelreservation;

public class HotelReservationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation program");
        HotelReservationService hotelReservationService =new HotelReservationService();
        hotelReservationService.addHotel(new Hotel("Lakewood",110));
    }
}
