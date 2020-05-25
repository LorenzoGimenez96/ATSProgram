/*
Ejercicio1: Hacer una programa que calcule e imprima la suma de tres calificaciones
 */
package Ejercicios_introduccion;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Scanner sirve para que el usuario pueda ingresar datos,
        habilitamos con esta etiqueta, es necesario importar(error)
         */
        Scanner entrada = new Scanner(System.in);

        /* elegimos float por que las calificaciones pueden ser en decimales
        puede contener comas Ej: 4.5 
         */
        // float es variable -- las notas son sus atributos
        float nota1, nota2, nota3, suma;

        //Pedimos al usuario sus datos, mostrando el mensaje con sout
        System.out.println("Digite sus 3 notas: ");
        /* en esta zona empezamos a capturar los datos del cliente
        mediantes las variables que hemos asignado mas arriba(notas)
        Es necesario llamar a (entrada.nexfFlota()) para poder realizar la captura
        es next float porque elegimos que nuestras variables sean flotantes, 
        esto puede variar dependiendo del caso(int, double, boolean)
        
         */

        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        suma = nota1+nota2+nota3;
        
        
        System.out.println("La suma de su calificacion es: "+suma);
    }

}
