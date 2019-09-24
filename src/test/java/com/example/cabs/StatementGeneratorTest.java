package com.example.cabs;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StatementGeneratorTest {

    @Test
    public void generateStatementForMultipleJourniesGivenTotalFareAndTime(){
        StatementGenerator generator = new StatementGenerator();
        List<Ride> rides = Arrays.asList(new Ride(3, 4), new Ride(5, 1));
        int totalFare = generator.create(rides);
        assertEquals(85, totalFare);
    }
}
