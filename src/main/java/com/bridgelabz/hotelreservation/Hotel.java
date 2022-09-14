package com.bridgelabz.hotelreservation;

public class Hotel {


    private final String name;
    private final int rate;
    private long totalCost;

    public Hotel(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public long getRate() {
        return rate;
    }

    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }
}
