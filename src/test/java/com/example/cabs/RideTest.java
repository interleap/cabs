package com.example.cabs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideTest {

    @Test
    public void generateStatementForAJourneyGivenTotalFare(){
        final Ride ride = new Ride(15, 0);
        assertEquals(150, ride.fare());
    }

    @Test
    public void generateStatementForAJourneyGivenTotalFareAndTime(){
        final Ride ride = new Ride(10, 4);
        assertEquals(104, ride.fare());
    }
}