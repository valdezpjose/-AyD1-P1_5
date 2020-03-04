/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd1.p1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;  

/**
 *
 * @author carlo
 */
public class numero_absoluto {
        
     public static void numero_absoluto() throws IOException
        { 
            double numero = 0;
            double absoluto = 0;
            Scanner sc = new Scanner(System.in); 
            System.out.println("---------- NUMERO ABSOLUTO ----------");
            System.out.print("Por favor ingresar el numero al que le desea conocer al absoluto: ");
            numero = sc.nextDouble();
            absoluto = Math.abs(numero);
            System.out.println("El valor absoluto del numero es: " + absoluto);
        }
}
