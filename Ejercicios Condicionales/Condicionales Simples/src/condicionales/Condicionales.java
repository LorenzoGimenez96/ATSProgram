/*
 Usamos condicionales if, else

if (condicion){
      Instruccion 1;
}

else {
        Instruccion 2;
}

 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Condicionales {

    /**
     == : igualdad
     != : Diferencia
     > : Mayor
     >= : Mayor o igual
     < : Menor
     <= : Menor o igual
     */
    public static void main(String[] args) {
     int numero, dato = 5;
     numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
     
     if (numero > dato){
         JOptionPane.showMessageDialog(null, "El numero es mayor a 5");
     }
     else {
         JOptionPane.showMessageDialog(null, "El numero es menor o igual 5");
     }
     
     
     
    }
    
}
