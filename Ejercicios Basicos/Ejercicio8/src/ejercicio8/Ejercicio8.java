/*
 * Ejercicio 8: Construir un programa que calcule y muestre por pantalla las raices
de la ecuacion de segundo grado de coeficientes reales. ax² + bx + c = 0

(Raiz cuadrada alt + 251
signo mas sobre menos alt + 241 
elevar al cuadrado alt + 253
   
- b ± √b² - 4ac
x = -------------
         2a
 
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a, b, c, raiz, division, diferencia ;
        
        System.out.println("Ingrese el valor de a: ");
         a = entrada.nextFloat();
         System.out.println("Ingrese el valor de b: ");
         b = entrada.nextFloat();
         System.out.println("Ingrese el valor de c: ");
         c = entrada.nextFloat();
         
         
         raiz = (float) ((Math.sqrt(Math.pow(b, 2)-4 * a * c)));
         diferencia = 2 * a ;
         division = raiz / diferencia ;
         
         System.out.println("EL resultado de esta operacion es: "+division);
         
   /*
         Lo siento, este no me salio, necesitamos matematicas aplicada..pasamos a la siguiente clase
         
         */
        
    }
    
}
