package com.example.cabs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatementGeneratorTest {
    @Test
    public void generateStatementForAJourney(){
        StatementGenerator generator = new StatementGenerator();
        int totalFare = generator.create(15);
        assertEquals(150, totalFare);
    }
}
