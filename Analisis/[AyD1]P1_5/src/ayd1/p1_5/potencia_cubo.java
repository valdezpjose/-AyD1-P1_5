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
        
        System.out.println(":::::::::: [n] Potencia ::::::::::");
        
        System.out.print("Número base: ");
        double num_base = Double.parseDouble(ob.readLine()); 
        
        System.out.print("Número exponente: ");
        double num_exp = Double.parseDouble(ob.readLine()); 
        
        double resultado = Math.pow(num_base, num_exp);
        msg mg = new msg();
        mg.mostrarResultado("[Resultado] " + num_base + "^" + num_exp  + " = " + resultado);
  
    }
    
}
