/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.jmoordb.mavenproject1;

import com.jmoordb.mavenproject1.implementation.CalculadoraImpl;

/**
 *
 * @author avbravo
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Calculadora c = new CalculadoraImpl();
        Integer a = 5;
        Integer b = 6;
        var r = c.sumar(a, b);
        System.out.println("La suma de "+ a+ " + "+b +"="+r);

    }
}
