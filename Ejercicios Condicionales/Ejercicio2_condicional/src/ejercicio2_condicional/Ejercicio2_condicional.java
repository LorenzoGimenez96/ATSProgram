/*
 Pedir dos numeros, y decir cual es mayor o si son iguales
 */
package ejercicio2_condicional;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ejercicio2_condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int numero1, numero2;
 
 numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
 numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
 
 if (numero1>=numero2){
     
     JOptionPane.showMessageDialog(null, "EL primer numero "+numero1+" es mayor o igual al segundo numero "+numero2);
 }
 else {
     JOptionPane.showMessageDialog(null, "El segundo numero "+numero2+" es mayor o igual al primer numero "+numero1);
 }
 
 
    }
    
}
