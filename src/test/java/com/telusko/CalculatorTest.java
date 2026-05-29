package com.telusko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    // @Test
    // void testAddition() {

    //     int actual = c.add(2,3);

    //     assertEquals(5, actual);
    // }

    // @Test
    // void testDivison(){
       
    //     assertThrows(
    //     ArithmeticException.class,
    //     ()-> c.div(2, 0)
    //     );
    // }

    // @Test
    // void testmultiplication(){
    //     int expected=c.mul(3, 2);
    //     int actual=6;
    //     assertEquals(expected, actual,"It didn't met the expectations");
    // }

    // @Test
    // void testSubtraction(){
      
    //     assertEquals(1 , c.sub(7, 6),  ()->"Test case failed");  // effective way of passing a message, as message would only be considered when test case fails 
    // }

    @Test
    void testAdd(){
        assertEquals(5, c.add(2, 3)); // If expected == Actual value, it fails the test case, else pass. Reverse of assertEquals.
    }

    @Test

    void testArray(){
        int expArr[]={1,2,3,4};
        int orgArr[]={3,4};
        assertArrayEquals(expArr, orgArr, "Error reported");
        }
    }
