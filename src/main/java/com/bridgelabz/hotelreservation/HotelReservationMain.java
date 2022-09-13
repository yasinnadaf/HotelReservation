package com.bridgelabz.hotelreservation;

import java.util.Scanner;

public class HotelReservationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation program");
        Scanner scanner =new Scanner(System.in);
        HotelReservationService hotelReservationService =new HotelReservationService();
        hotelReservationService.addHotel(new Hotel("Lakewood",110));
        hotelReservationService.addHotel(new Hotel("Bridgewood", 160));
        hotelReservationService.addHotel(new Hotel("Ridgewood", 220));

        System.out.println("Enter check-in date: (dd-mm=yyyy) ex. 01-01-2000");
        String checkInDate = scanner.nextLine();
        System.out.println("Enter check-out date: (dd-mm=yyyy)");
        String checkOutDate = scanner.nextLine();
        Hotel cheapestHotel = hotelReservationService.getCheapestHotel(checkInDate, checkOutDate);
        System.out.println("Cheapest Hotel: " + cheapestHotel.getName() + ", Total Cost: " + cheapestHotel.getTotalCost());
    }


}
