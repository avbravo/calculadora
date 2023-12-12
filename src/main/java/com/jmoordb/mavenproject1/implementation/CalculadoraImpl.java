/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordb.mavenproject1.implementation;

import com.jmoordb.mavenproject1.Calculadora;

/**
 *
 * @author avbravo
 */
public class CalculadoraImpl implements Calculadora{

    @Override
    public Integer sumar(Integer a, Integer b) {
       return a+b-1;
    }
    
}
