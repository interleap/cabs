package com.example.cabs;

public class Ride {
    private static final int FARE_PER_KM = 10;
    private static final int FARE_PER_MINUTE = 1;
    private final int distance;
    private final int timeInMinutes;

    public Ride(int distance, int timeInMinutes) {
        this.distance = distance;
        this.timeInMinutes = timeInMinutes;
    }

    int fare() {
        return FARE_PER_KM * distance + FARE_PER_MINUTE * timeInMinutes;
    }
}
