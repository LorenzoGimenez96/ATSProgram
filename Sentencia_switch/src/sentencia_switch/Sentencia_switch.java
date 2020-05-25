/* La sentencia Switch:

switch(dato) {
    case 1: Instrucciones1;
        break;
    case 2: Isntrucciones2;
        break;
    ...
    case n: InstruccionesN;
        break;
    default: CasoContrario;
        break;
}




*/
package sentencia_switch;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Sentencia_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dato;
       
       dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 - 5"));
       
       
       switch(dato){
           case 1 : JOptionPane.showMessageDialog(null, "El numero es 1");
                    break;
           case 2 : JOptionPane.showMessageDialog(null, "El numero es 2");
                    break;
           case 3 : JOptionPane.showMessageDialog(null, "El numero es 3");
                    break;
           case 4 : JOptionPane.showMessageDialog(null, "El numero es 4");
                    break;
           case 5 : JOptionPane.showMessageDialog(null, "El numero es 5");
                    break;
           default : JOptionPane.showMessageDialog(null, "El numero es diferente a 5");
                    break;
       }
               
       
       
    }
    
}
