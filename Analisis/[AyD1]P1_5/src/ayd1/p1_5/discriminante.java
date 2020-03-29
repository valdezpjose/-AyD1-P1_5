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
 * @author juanpi
 */
public class discriminante {
    
            public static void darDiscri() throws IOException
        { 
            BufferedReader ob =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("/////////////////FUNCION DISCRIMINANTE///////////////////////////////////////////// :\n");
            System.out.println("Ingrese los valores de a,b,c:\n");
            System.out.println("Ingrese a:\n");
            int a=Integer.parseInt(ob.readLine()); 
            System.out.println("Ingrese b:\n");
            int b=Integer.parseInt(ob.readLine()); 
            System.out.println("Ingrese c:\n");
            int c=Integer.parseInt(ob.readLine()); 
            System.out.println("////////////////////////RESULTADO////////////////////////////////////// :\n");

            int discriminant = (int)Math.pow(b,2) - (4*a*c);  
            if (discriminant > 0){ 
                System.out.println("Discriminante es " + discriminant);
                System.out.println("Dos Soluciones"); 
                System.out.println("////////////////////////////////////////////////////////////// :\n");
            } 
            else if (discriminant == 0){ 
                System.out.println("Discriminante es " + discriminant); 
                System.out.println("Una Solución"); 
                System.out.println("////////////////////////////////////////////////////////////// :\n");
            } 
            else { 
                
                System.out.println("Discriminante es "+ discriminant); 
                System.out.println("No hay solución real"); 
                System.out.println("////////////////////////////////////////////////////////////// :\n");
            } 
        } 
    
}
