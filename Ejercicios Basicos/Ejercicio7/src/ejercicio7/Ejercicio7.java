/* Construir un programa que, dado el numero total de horas, devuelve el numero de
semanas, dias y horas equivalentes.
 * Por ejemplo, dado un total de 1000 horas, debe mostrar 5 semanas, 6 dias y 16 horas
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int HorasTotales, semanas, dias, horas;

        System.out.println("Digite el numero de horas: ");

        HorasTotales = entrada.nextInt();
        semanas = HorasTotales / 168;
        dias = HorasTotales % 168 / 24;
        horas = HorasTotales % 24;

        System.out.println("El resultado es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);

    }

}
