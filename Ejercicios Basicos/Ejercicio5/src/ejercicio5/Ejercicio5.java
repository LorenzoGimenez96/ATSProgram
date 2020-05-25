/*
Ejercicio5: la calificacion final de un estudiante de informatica se calcula
con base a las calificaciones de cuatro aspectos de su examen de rendimiento academicoL
participacion, primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificacion final con ponderacopmes
del 10%, 25%, 25% y 40%. Hacer un programa que calcule e imprima la calificacion 
final obtenida por un estudiante
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float participacion, primerex, segundoex, exfinal, totalfinal;

        System.out.println("Ingrese su nota de participacion: ");
        participacion = entrada.nextFloat();

        System.out.println("Ingrese su nota del primer examen: ");
        primerex = entrada.nextFloat();

        System.out.println("Ingrese su nota del segundo examen: ");
        segundoex = entrada.nextFloat();

        System.out.println("Ingrese su nota del examen final: ");
        exfinal = entrada.nextFloat();

        participacion *= 0.10f;

        primerex *= 0.25f;

        segundoex *= 0.25f;

        exfinal *= 0.40f;

        totalfinal = participacion + primerex + segundoex + exfinal;

        System.out.println("Su nota final es: " + totalfinal);

    }

}
