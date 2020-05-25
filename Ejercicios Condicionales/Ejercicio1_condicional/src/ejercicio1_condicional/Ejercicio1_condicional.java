/*
Ejercicio1: Hacer un programa que lea un numero entero y muestre si
el numero es multiplo de 10.

 */
package ejercicio1_condicional;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ejercicio1_condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numero;
            
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
    
    if(numero%10 == 0) {
        JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de  10");
    }
    else {
        JOptionPane.showMessageDialog(null, "El numero ingresado no es multiplo de 10");
    }
            
    }
    
}
