package com.example.cabs;

import java.util.List;

public class StatementGenerator {

    public int create(List<Ride> rides) {
        int fare = 0;
        for (Ride ride : rides) {
            fare += ride.fare();
        }
        return fare;
    }

}
