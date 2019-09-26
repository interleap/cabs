package com.example.cabs;

public class Statement {
    private int numberOfRides;
    private double farePerRide;
    private double totalFare;

    public Statement(int numberOfRides, double farePerRide, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.farePerRide = farePerRide;
        this.totalFare = totalFare;
    }

    public int getNumberOfRides() {
        return numberOfRides;
    }

    public double getFarePerRide() {
        return farePerRide;
    }

    public double getTotalFare() {
        return totalFare;
    }
}
