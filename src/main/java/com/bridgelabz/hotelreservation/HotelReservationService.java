package com.bridgelabz.hotelreservation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservationService {
    static LocalDate inDate ,outDate;
    List<Hotel> hotelList = new ArrayList<>();

    public boolean addHotel(Hotel hotel){
        hotelList.add(hotel);
        return true;
    }
    Scanner scr = new Scanner(System.in);
    String checkInDate;
    String checkOutDate;

    public void enterDates(){

        System.out.println("Enter check In Date: eg(dd-mm-yy)");
        checkInDate = scr.nextLine();
        System.out.println("Enter check Out Date: eg(dd-mm-yy)");
        checkOutDate = scr.nextLine();

        inDate = LocalDate.of(Integer.parseInt(checkInDate.substring(5,9)),Integer.parseInt(checkInDate.substring(3,4)),Integer.parseInt(checkInDate.substring(0,2)));
        outDate = LocalDate.of(Integer.parseInt(checkOutDate.substring(5,9)),Integer.parseInt(checkOutDate.substring(3,4)),Integer.parseInt(checkOutDate.substring(0,2))).plusDays(1);

    }

     Hotel cheapestHotel(){
        enterDates();
        long totalDays = ChronoUnit.DAYS.between(inDate, outDate);
         calculateTotalCost(totalDays);
         hotelList.sort(Comparator.comparing(Hotel::getTotalCost));
         Hotel cheapRate = hotelList.get(0);

         return cheapRate;
     }

    void calculateTotalCost(long totalDays) {
        hotelList.stream().forEach(x -> {
            x.setTotalCost(totalDays * x.getRate());
        });
    }
}

