/*
Ejercicio4: En Ferrex se hace un 20% de descuento a los clientes 
cuya compra supere los Gs 300.000 Cual sera la cantidad que pagara
una persona por su compra?


 */
package ejercicio4_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ejercicio4_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nl = System.getProperty("line.separator");
        
        int base = 300000, porcentaje = 20, compra, descuento, total;

        compra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto total de compra: " + "Gs"));

        if (compra >= base) {

            descuento = (compra * porcentaje) / 100;

            total = compra - descuento;

            JOptionPane.showMessageDialog(null, "Su compra con el descuento es:" + total + "Gs"
            + nl + "El descuento aplicado es de:" + descuento );
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, su compra no alcanza para el descuento." + compra + "Gs");
        }

    }

}
