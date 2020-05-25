/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio9;


      import java.util.Scanner;

//Razones_TrigonometricasPitagoras15
        
public class Ejecicio9  {

  
    public static void main(String[] args) {
        Scanner entrada = new  Scanner(System.in);
        System.out.println("CALCULO DE RELACCIONES TRIGONOMETRICAS");
        System.out.println("en caso de faltar algun valor, ponga de valor 0");
               System.out.println("");
               
                
 double cateto1, cateto2, hipotenusa;       
 double operacion1, operacion2;
 double tg, tg2, sen, sen2, cos, cos2;
 
 
 
 
        System.out.println("inserte el cateto 1(opuesto al angulo):");
cateto1 = entrada.nextFloat();
        System.out.println("inserte el cateto 2(continuo al angulo):");
cateto2 = entrada.nextFloat();
        System.out.println("inserte la hipotenusa:");
hipotenusa = entrada.nextFloat();

if (hipotenusa == 0){
    operacion1 = cateto1*cateto1+cateto2*cateto2;
    operacion2 = Math.sqrt(operacion1);
    System.out.println("la hipotenusa es:"+operacion2);
    
    
    
    tg = cateto1;      
tg2 = cateto2;
sen = cateto1;
sen2 = operacion2;
cos = cateto2;
cos2= operacion2;

        System.out.println("");
        System.out.println("");

        System.out.print("la tangente es: "+tg);
        System.out.print("/"+tg2);
        
        System.out.println("");
        System.out.println("");
             
        
        System.out.print("el sen es: "+sen);
        System.out.print("/"+sen2);
        
        System.out.println("");
        System.out.println("");
        
        System.out.print("la constante es: "+cos);
        System.out.print("/"+cos2);
}

if (cateto1 == 0){
    operacion1 = hipotenusa*hipotenusa-cateto2*cateto2;
    operacion2 = Math.sqrt(operacion1);
    System.out.println("el cateto que falta es:"+operacion2);
          
    
    
    
    tg = operacion2;      
tg2 = cateto2;
sen = operacion2;
sen2 = hipotenusa;
cos = cateto2;
cos2= hipotenusa;

        System.out.println("");
        System.out.println("");

        System.out.print("la tangente es: "+tg);
        System.out.print("/"+tg2);
        
        System.out.println("");
        System.out.println("");
             
        
        System.out.print("el sen es: "+sen);
        System.out.print("/"+sen2);
        
        System.out.println("");
        System.out.println("");
        
        System.out.print("la constante es: "+cos);
        System.out.print("/"+cos2);
}
if (cateto2 == 0){
    operacion1 = hipotenusa*hipotenusa-cateto1*cateto1;
    operacion2 = Math.sqrt(operacion1);
    System.out.println("el cateto que falta es:"+operacion2);
       
    
    
    tg = cateto1;      
tg2 = operacion2;
sen = cateto1;
sen2 = hipotenusa;
cos = operacion2;
cos2= hipotenusa;

        System.out.println("");
        System.out.println("");

        System.out.print("la tangente es: "+tg);
        System.out.print("/"+tg2);
        
        System.out.println("");
        System.out.println("");
             
        
        System.out.print("el sen es: "+sen);
        System.out.print("/"+sen2);
        
        System.out.println("");
        System.out.println("");
        
        System.out.print("la constante es: "+cos);
        System.out.print("/"+cos2);
}












    }
    
}
