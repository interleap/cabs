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
        Statement expected = new Statement(2, 42.5, 85);

        assertEquals(expected, actual);
    }
}
