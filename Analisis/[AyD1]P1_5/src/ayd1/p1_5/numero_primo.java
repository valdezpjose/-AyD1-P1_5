/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd1.p1_5;

import javax.swing.JOptionPane;

/**
 *
 * @author valde
 */
public class numero_primo {

    public static boolean esPrimo(long n) {
        if (n < 2) {
           msg mg = new msg();
                 mg.mostrarResultado("No es Primo");
            return false;
        }
        if (n == 2 || n == 3) {
             msg mg = new msg();
        mg.mostrarResultado("Es Primo");
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            msg mg = new msg();
                 mg.mostrarResultado("No es Primo");
            return false;
        }
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                 msg mg = new msg();
                 mg.mostrarResultado("No es Primo");
          
                return false;
                
            }
        }
        msg mg = new msg();
        mg.mostrarResultado("Es Primo");
        return true;
    
    }
}
