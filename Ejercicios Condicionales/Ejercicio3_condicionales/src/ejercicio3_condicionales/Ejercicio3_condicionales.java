/*

Hacer un programa que nos indique si la letra es mayuscula o minuscula.

 */
package ejercicio3_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ejercicio3_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definir la variable tipo caracter(char) en este caso, letra
        char letra;                 
                //llama al cuadro de dialogo//mensaje del cuadro//indica cual es la ubicacion del caracter, define dentro del ()
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
                    //indica si la letra es mayuscula
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra ingresada es mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "La letra ingresada es minuscula");
        }

    }

}
