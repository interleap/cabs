package com.example.cabs;

public class StatementGenerator {

    private static final int FARE_PER_KM = 10;
    private static final int FARE_PER_MINUTE = 1;

    public int create(int distance, int timeInMinutes) {
        return FARE_PER_KM * distance + FARE_PER_MINUTE * timeInMinutes;
    }
}
