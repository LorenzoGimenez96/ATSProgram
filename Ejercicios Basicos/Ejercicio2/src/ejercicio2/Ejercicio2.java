/*
Ejercicio 1: Hacer un programa que calcule e imprima el salario de un empleado 
a partir de sus horas semanales trabajadas y de su salario por hora
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     int salarioxhora, horastrabajadas, diastrabajados,totaldiario, totalsemanal, mensual, anual;
     
      System.out.println("Cuanto es su salario por hora?: ");
     salarioxhora = entrada.nextInt();
     
        System.out.println("Cuantas horas trabaja por dia?: ");
     horastrabajadas = entrada.nextInt();
     
        System.out.println("Cuantos dias trabaja en la semana?: ");
     diastrabajados = entrada.nextInt();
     
     totaldiario = salarioxhora * horastrabajadas;
     totalsemanal = totaldiario * diastrabajados;
     mensual = totalsemanal * 4;
     anual = mensual * 12;
     
        System.out.println("Usted gana diariamente: "+totaldiario);
        System.out.println("Usted gana semanalmente: "+totalsemanal);
        System.out.println("Usted gana mensualmente: "+mensual);
        System.out.println("Usted gana anualmente: "+anual);
    
    }

}
