package ayd1.p1_5;

import static ayd1.p1_5.Multiplicacion_Division.Multiplicacion_Division;
import static ayd1.p1_5.discriminante.darDiscri;
import static ayd1.p1_5.numero_absoluto.numero_absoluto;
import static ayd1.p1_5.potencia_cubo.Potencia;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * @author valde
 */
public class AyD1P1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        JOptionPane.showMessageDialog(null, "Analisis Grupo 5 Practica 1 Bienvenido");
        Scanner teclado = new Scanner(System.in);
        String menu;
        menu = teclado.nextLine();
       
        while(true){
            System.out.print("Menu"+"\n"+"1. Numero Primo"+"\n"+"2. Numero Discriminante"+"\n"+"3. Potencia"+"\n"+"4. Numero Absoluto"+"\n"+"5. Multiplicacion/Division"+"\n6. Par/Impar"+"\n7. Raiz Cubica\n8. Exit \n");
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
            }else if(menu.equals("5")){
               Multiplicacion_Division();
            }else if(menu.equals("6")){
                System.out.print("Ingrese un numero:");
                menu = teclado.nextLine();
                parImpar pi = new parImpar();
                pi.parImpar(Integer.parseInt(menu));
            }else if(menu.equals("7")){
                System.out.println("Ingrese un numero:");
                menu = teclado.nextLine();
                RaizCubica r = new RaizCubica();
                double res = r.getResult(Double.parseDouble(menu));
                DecimalFormat df = new DecimalFormat("#.###");
                df.setRoundingMode(RoundingMode.CEILING);
                msg.mostrarResultado(df.format(res));
            }else if(menu.equals("8")){
                System.exit(0);
            }else{
                System.out.println("Opcion invalida");
            }
        }
        
    }
    
}