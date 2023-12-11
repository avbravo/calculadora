/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.jmoordb.mavenproject1.implementation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author avbravo
 */
public class CalculadoraImplTest {
    
    public CalculadoraImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of sumar method, of class CalculadoraImpl.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Integer a = 5;
        Integer b = 6;
        CalculadoraImpl instance = new CalculadoraImpl();
        Integer expResult =11;
        Integer result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
