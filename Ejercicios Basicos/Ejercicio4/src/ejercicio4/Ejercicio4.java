/*Ejercicio4= Una compania de venta de carros usados, paga a su personal
de ventas un salario de $ 1000 mensuales, mas una comision de $ 150 dolares
por cada carro vendido, mas el 5% del valor de venta por carro. Cada mes el capturista
de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa
que calcule e imprima el salario mensual de un vendedor dado.
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salariomensual, comision, porcentaje, total;

        System.out.println("Ingrese el salario de un vendedor: ");
        
        salariomensual = entrada.nextFloat();
        comision = salariomensual + 150;
        porcentaje = (salariomensual + comision) * 5 / 100;
        
        total = salariomensual+comision+porcentaje;
        
        System.out.println("Su comision es: "+comision);
        System.out.println("Su porcentaje correspondiente es: "+porcentaje);
        
        System.out.println("El salario total del vendedor es: "+total);
        

    }

}
