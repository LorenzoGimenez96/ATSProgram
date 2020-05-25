/*
 Ejercicio 8: 
Pedir un numero entre 0 y 99.999 y decir cuantas cifras tiene.
 */
package ejercicio8_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ejercicio8_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaro variable num1
        int num1;
        //Capturo el num1
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 99.999"));

        //Declaro una variable CIFRA como un String, y convierto el num1 en una cadena.
        String cifra = Integer.toString(num1);
        
        //El .length() da a conocer el tamano de la cadena(digitos en este caso)
        JOptionPane.showMessageDialog(null, "El numero " + num1 + " tiene: " + cifra.length() + " cifra(s)");

    }

}
