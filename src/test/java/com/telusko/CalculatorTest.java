package com.telusko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAddition() {

        int actual = c.add(2,3);

        assertEquals(5, actual);
    }

    @Test
    void testDivison(){
       
        assertThrows(
        ArithmeticException.class,
        ()-> c.div(2, 0)
        );
    }
}