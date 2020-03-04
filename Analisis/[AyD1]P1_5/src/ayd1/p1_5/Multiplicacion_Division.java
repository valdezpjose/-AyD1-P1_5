/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd1.p1_5;

import java.util.Scanner;

/**
 *
 * @author 50242
 */
public class Multiplicacion_Division {
     public static void Multiplicacion_Division(){
            double numero1 = 0;
            double numero2 = 0;
            double resultado=0;
            int opcion=0;
            Scanner sc = new Scanner(System.in); 
            System.out.println("--Seleccione Opcion--");
            System.out.println(" 1. Multiplicacion");
            System.out.println(" 2.Division   ");
            System.out.println("-----------------");
            opcion = sc.nextInt();
            
            
            if(opcion==1){
            System.out.print("Ingrese numero ");
            numero1 = sc.nextDouble();
            System.out.print("Ingrese numero ");
             numero2 = sc.nextDouble();
             resultado=numero1*numero2;
            System.out.println("El valor de la multiplicacion de "+numero1 + " por " + numero2+" es "+resultado);
            }else if(opcion==2){
            System.out.print("Ingrese numero ");
            numero1 = sc.nextDouble();
            System.out.print("Ingrese numero ");
            numero2 = sc.nextDouble();
            
            if(numero2==0){
                System.out.println("No se puede dividir entre 0, el resultado es indefinido");
            }else {
             resultado=numero1/numero2;
            
             System.out.println("El valor de la division de "+numero1 + " entre " + numero2+" es "+resultado);
            }
            
            }else {
             System.out.println("opcion no valida");
            }
           
}
}
