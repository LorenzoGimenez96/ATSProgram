/*Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo
 *Juan tiene la mitad de lo que poseen Liuis y Guillermo juntos
Hacer un programa que calcule e imprima la cantidad de dinero que tienen los tres
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);//llamamos a Scanner
               float guillermo,luis,juan,total; //asignamos las variables(tipo float)
               
               System.out.println("Digite la cantidad de dinero que tiene Guillermo: ");
               //solicitamos al usuario los datos
              
               guillermo = entrada.nextFloat();
                 //capturamos los datos del usuario
               
               luis = guillermo/2;
               juan = (guillermo+luis)/2;
               
               /*con los datos obtenidos estamos realizando internamente los calculos
               de luis,juan.. luego calculamos el total
               
               
               */
           
               total = guillermo+luis+juan;
               
               /*
               A parte mostramos lo que cada uno tiene, y cual es el total
               
               */
               System.out.println("Guillermo tiene: "+guillermo);
            System.out.println("Luis tiene: "+luis);
            System.out.println("Juan tiene: "+juan);
               System.out.println("La cantidad de dinero que tienen es: "+total);
               //Mostramos el mensaje en pantalla, y le agregamos +total, 
               //para mostrar el resultado de la operacion 
    }
    
}
