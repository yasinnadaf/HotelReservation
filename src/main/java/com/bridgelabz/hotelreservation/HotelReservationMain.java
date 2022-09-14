package com.bridgelabz.hotelreservation;

public class HotelReservationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation program");
        HotelReservationService hotelReservation = new HotelReservationService();
        hotelReservation.addHotel(new Hotel("Lakewood", 110));
        hotelReservation.addHotel(new Hotel("Bridgewood", 160));
        hotelReservation.addHotel(new Hotel("Ridgewood", 220));

        Hotel cheapest = hotelReservation.cheapestHotel();
        System.out.println("Cheapest Hotel: " + cheapest.getName() + ", Total Cost: " + cheapest.getTotalCost());
    }

}
