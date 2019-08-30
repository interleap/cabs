package com.example.cabs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatementGeneratorTest {
    @Test
    public void generateStatementForAJourneyGivenTotalFare(){
        StatementGenerator generator = new StatementGenerator();
        int totalFare = generator.create(15, 0);
        assertEquals(150, totalFare);
    }
    @Test
    public void generateStatementForAJourneyGivenTotalFareAndTime(){
        StatementGenerator generator = new StatementGenerator();
        int totalFare = generator.create(10, 4);
        assertEquals(104, totalFare);
    }
}
