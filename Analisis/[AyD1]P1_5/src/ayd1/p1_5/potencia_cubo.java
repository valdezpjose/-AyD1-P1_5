/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd1.p1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author icues
 */
public class potencia_cubo {
 
    public static void Potencia() throws IOException {
        BufferedReader ob =new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("::::: Potencia ^3 :::::");
        
        System.out.println("Ingrese un número");
        double num = Double.parseDouble(ob.readLine()); 
        
        double resultado = Math.pow(num, 3);
        System.out.println("El resultado es: " + resultado);
    }
}
