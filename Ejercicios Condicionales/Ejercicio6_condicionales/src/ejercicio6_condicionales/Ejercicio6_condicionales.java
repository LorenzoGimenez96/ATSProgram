/*
 Ejercicio 6:
Hacer un programa que tome dos numeros y diga si ambos son pares o impares.
 */
package ejercicio6_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ejercicio6_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero1, numero2 ;
       
       numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
       numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
       
       if (numero1%2==0){
           JOptionPane.showMessageDialog(null, "El primer numero insertado es PAR");
       }
       else {
           JOptionPane.showMessageDialog(null, "El primer numero es IMPAR");
       }
       
       if (numero2%2==0){
        JOptionPane.showMessageDialog(null, "El segundo numero es PAR");
    }
       else {
               JOptionPane.showMessageDialog(null, "El segundo numero es IMPAR");
               }
    }
    
}
