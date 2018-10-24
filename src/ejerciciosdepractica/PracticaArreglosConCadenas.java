/*
Practica de arreglos con cadenas
Evelyn Lopez Nieto
26/07/2018
1:00 pm
*/


package ejerciciosdepractica;

import java.util.Scanner;

public class PracticaArreglosConCadenas {

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        
        String cadena[]=new String[3];
        
                
        for(int contador=0; contador<cadena.length; contador++){
            
            System.out.println("Ingrese palabra "+contador+":");
            cadena[contador]=entrada.nextLine();
        }
        
        System.out.println("\n\nIndice\tPalabras");
        
        for(int contador2=0; contador2<cadena.length; contador2++){
            
            System.out.println(contador2+"\t"+cadena[contador2]);
        }
    }
    
}
