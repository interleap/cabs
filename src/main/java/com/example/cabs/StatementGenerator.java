package com.example.cabs;

import java.util.List;

public class StatementGenerator {

    public Statement create(List<Ride> rides) {
        double fare = totalFare(rides);
        return new Statement(rides.size(), fare/rides.size(), fare);
    }

    private double totalFare(List<Ride> rides) {
        double fare = 0;
        for (Ride ride : rides) {
            fare += ride.fare();
        }
        return fare;
    }
}
