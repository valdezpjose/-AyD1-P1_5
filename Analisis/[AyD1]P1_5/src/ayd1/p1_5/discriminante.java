﻿/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//JUANPABLO
package ayd1.p1_5;

import Colores.Console_Colors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//COMMIT 201222615
/**
 *
 * @author juanpi
 */
public class discriminante {
    
            public static void darDiscri() throws IOException
        { 
            BufferedReader ob =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("/////////////////FUNCION DISCRIMINANTE///////////////////////////////////////////// :\n");
            System.out.println(Console_Colors.PURPLE + "Ingrese los valores de a,b,c:\n" +Console_Colors.RESET );
            System.out.println(Console_Colors.BLUE_BOLD + "Ingrese a:\n" +Console_Colors.RESET);
            int a=Integer.parseInt(ob.readLine()); 
            System.out.println( Console_Colors.BLUE_BOLD + "Ingrese b:\n" +Console_Colors.RESET );
            int b=Integer.parseInt(ob.readLine()); 
            System.out.println( Console_Colors.BLUE_BOLD + "Ingrese c:\n" +Console_Colors.RESET );
            int c=Integer.parseInt(ob.readLine()); 
            System.out.println("////////////////////////RESULTADO////////////////////////////////////// :\n");

            int discriminant = (int)Math.pow(b,2) - (4*a*c);  
            if (discriminant > 0){ 
                System.out.println(Console_Colors.GREEN_BRIGHT + "Discriminante es" +Console_Colors.RESET + Console_Colors.GREEN_BRIGHT +discriminant +Console_Colors.RESET);
                System.out.println("Dos Soluciones"); 
                System.out.println("////////////////////////////////////////////////////////////// :\n");
            } 
            else if (discriminant == 0){ 
			
                System.out.println(Console_Colors.GREEN_BRIGHT + "Discriminante es" +Console_Colors.RESET + Console_Colors.GREEN_BRIGHT +discriminant +Console_Colors.RESET);
				
                System.out.println(Console_Colors.RED + "Una Solución para Calificacion 201222615" +Console_Colors.RESET);
				
                System.out.println("////////////////////////////CALIFICACION 20122615////////////////////////////////// :\n");
            } 
            else { 
                System.out.println(Console_Colors.GREEN_BOLD + "Discriminante es" +Console_Colors.RESET + Console_Colors.GREEN_BOLD + discriminant+Console_Colors.RESET );
                System.out.println(Console_Colors.RED + "No hay solución real" +Console_Colors.RESET);
                System.out.println("////////////////////////////////////////////////////////////// :\n");
            } 
        } 
    
}
