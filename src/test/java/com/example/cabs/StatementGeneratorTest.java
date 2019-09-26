package com.example.cabs;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class StatementGeneratorTest {
    @Test
    public void generateStatementForMultipleJourniesGivenTotalFareAndTime(){
        StatementGenerator generator = new StatementGenerator();
        List<Ride> rides = asList(new Ride(3, 4),
                                  new Ride(5, 1));
        Statement actual = generator.create(rides);

        assertEquals(85, actual.getTotalFare(), .01);
        assertEquals(42.5, actual.getFarePerRide(), .01);
        assertEquals(2, actual.getNumberOfRides(), .01);
    }
}
