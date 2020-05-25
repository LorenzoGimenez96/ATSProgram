/*
Ejercicio7 = Pedir tres numeros y mostrarlos ordenados de mayor a menor.
 */
package ejercicio7_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ejercicio7_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1, n2, n3;
         n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
         n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrse el segundo numero: "));
         n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));
         
         if ((n1>n2) &&(n2>n3)){
             JOptionPane.showMessageDialog(null,"EL orden es: "+n1+" - "+n2+" - "+n3 );
         }
         else if ((n1>n3) && (n3>n2)){
             JOptionPane.showMessageDialog(null, "El orden es: "+n1+" - "+n3+" - "+n2);
         }
         else if ((n2>n1) && (n1>n3)){
             JOptionPane.showMessageDialog(null, "El orden es: "+n2+" - "+n1+" - "+n3);
         }
         else if ((n2>n3) && (n3>n1)){
         JOptionPane.showMessageDialog(null, "El orden es: "+n2+" - "+n3+" - "+n1);
         }
         else if ((n3>n1) && (n1>n2)){
        JOptionPane.showMessageDialog(null, "El orden es: "+n3+" - "+n1+" - "+n2);
    }
         else {
             JOptionPane.showMessageDialog(null, "El orden es: "+n3+" - "+n2+" - "+n1);
         }
         
    }
    
}
