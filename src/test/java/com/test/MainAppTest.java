package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.MainApp;

public class MainAppTest {
    
    MainApp m = new MainApp(); 
    
    @Test
    public void testPositive() {
        System.out.println("Test 1");
        assertEquals(5, m.addition(2, 3));
        System.out.println("Correct");
    }
    @Test
    public void testMultiplication() {
        System.out.println("Test 2");
        assertEquals(6, m.multiply(2, 3)); 
        System.out.println("correct");
    }
}
