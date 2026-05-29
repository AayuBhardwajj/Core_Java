package com.telusko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

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

    
    // @Test
    // void testAdd(){
    //     assertEquals(5, c.add(2, 3)); // If expected == Actual value, it fails the test case, else pass. Reverse of assertEquals.
    // }

    // @Test

    // void testArray(){
    //     int expArr[]={1,2,3,4};
    //     int orgArr[]={3,4};
    //     assertArrayEquals(expArr, orgArr, "Error reported");
    //     }

    @Test
    @BeforeEach
    void test1(){
        System.out.println("Test Case 1");
    }
    @Test
     void test2(){
        System.out.println("Test Case 2");
    }
    @Test
     void test3(){
        System.out.println("Test Case 3");
    }
    @Test
     void test4(){
        System.out.println("Test Case 4");
    }
    @Test
    @AfterEach
    void test5(){
        System.out.println("Test ran successfully, after each");
    }
    @Test
    @BeforeAll
    static void test6(){
        System.out.println("Before all test cases, this is to be executed");
    }
     @Test
    @AfterAll
    static void test7(){
        System.out.println("After all test cases, this is to be executed");
    }
    }
