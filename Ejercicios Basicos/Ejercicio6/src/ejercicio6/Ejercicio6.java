/*
 *Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma.
( a + b )² = a² + b ² + 2ab

 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
     
     float a, b, resultado1;
     
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextFloat();
        
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextFloat();
        
        resultado1 = (float) Math.pow((a+b), 2);
        
        System.out.println("EL resultado de la operacion es:"+resultado1);
        
     
     
     
    }
    
}
