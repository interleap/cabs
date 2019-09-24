package com.example.cabs;

import java.util.Objects;

public class Statement {
    private int numberOfRides;
    private double farePerRide;
    private double totalFare;

    public Statement(int numberOfRides, double farePerRide, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.farePerRide = farePerRide;
        this.totalFare = totalFare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statement statement = (Statement) o;
        return numberOfRides == statement.numberOfRides &&
                Double.compare(statement.farePerRide, farePerRide) == 0 &&
                Double.compare(statement.totalFare, totalFare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRides, farePerRide, totalFare);
    }

    @Override
    public String toString() {
        return "Statement{" +
                "numberOfRides=" + numberOfRides +
                ", farePerRide=" + farePerRide +
                ", totalFare=" + totalFare +
                '}';
    }
}
