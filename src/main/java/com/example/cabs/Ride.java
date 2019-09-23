package com.example.cabs;

public class Ride {
    private final int distance;
    private final int timeInMinutes;
    private static final int FARE_PER_KM = 10;
    private static final int FARE_PER_MINUTE = 1;

    public Ride(int distance, int timeInMinutes) {
        this.distance = distance;
        this.timeInMinutes = timeInMinutes;
    }

    public int getDistance() {
        return distance;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    int fare() {
        return FARE_PER_KM * getDistance() + FARE_PER_MINUTE * getTimeInMinutes();
    }
}
