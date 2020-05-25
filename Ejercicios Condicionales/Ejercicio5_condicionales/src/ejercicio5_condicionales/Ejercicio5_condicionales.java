/*
Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siquiente manera:
* Si trabaja 40 horas o menos se le paga Gs 8000 por hora.
*Si trabaja mas de 40 horas, se le paga Gs 800 por cada una de las primeras 40 horas y Gs 9000 por cada hora extra
 */
package ejercicio5_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ejercicio5_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String SL = System.getProperty("line.separator");
        int horasTrabajadas;
        float horasExtras, horasTotales;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Inserte aqui las horas trabajadas: "));

        if (horasTrabajadas <= 40) {

            horasTotales = horasTrabajadas * 8000;
        } else {
            horasTotales = (40 * 8000) + ((horasTrabajadas - 40) * 9000);
        }
        JOptionPane.showMessageDialog(null, "El total de horas trabajas es: " + horasTrabajadas + SL + "Y corresponde a un total de Gs: " + horasTotales);

    }

}
