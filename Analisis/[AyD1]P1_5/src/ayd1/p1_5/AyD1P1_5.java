/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd1.p1_5;

import static ayd1.p1_5.discriminante.darDiscri;
import static ayd1.p1_5.numero_absoluto.numero_absoluto;
import static ayd1.p1_5.potencia_cubo.Potencia;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author valde
 */
public class AyD1P1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        String menu;
        
        menu = teclado.nextLine();
        
        System.out.print("Menu"+"\n"+"1. Numero Primo"+"\n"+"2. Numero Discriminante"+"\n"+"3. Potencia"+"\n"+"4. Numero Absoluto"+"\n");
        menu = teclado.nextLine();
        
        if(menu.equals("1")){
            System.out.print("Ingrese un numero:");
            menu = teclado.nextLine();
            
        numero_primo pr = new numero_primo();
        pr.esPrimo(Integer.parseInt(menu)); 
        }else if(menu.equals("2")){
            darDiscri();
        }else if(menu.equals("3")){
            Potencia();
        }else if(menu.equals("4")){
            numero_absoluto();
        }else{
            System.out.println("Opcion invalida");
        }
        
        
        
        //
        //
       
        //
        
        // TODO code application logic here
    }
    
}
