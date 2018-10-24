
package ejerciciosdepractica;

import java.util.Scanner;
import javax.swing.*;

public class CadenasPorTeclado {
    
    public static void main(String [] args){
        
        Scanner entrada=new Scanner(System.in);
        
        
        /*System.out.println("Ingrese su nombre completo: ");
        String nombre=entrada.nextLine();
        System.out.println();
        
        System.out.println("Ingrese su edad: ");
        int edad=entrada.nextInt();
        System.out.println();
        
        System.out.println("Ingrese su promedio: ");
        double prom=entrada.nextDouble();
        System.out.println();
        
        System.out.println("Su nombre es "+nombre+", usted tiene "+edad+" años, y su promedio es de "+prom+".");
        */
        
        for(int h=1; h<=2; h++){
        for(int i=1; i<=3; i++){
            System.out.println("*............................*");
            System.out.println("******..................******");
            System.out.println("**********.........***********");
            System.out.println("**************.***************");
            System.out.println("**********.........***********");
            System.out.println("******..................******");
            System.out.println("*............................*");
        }
        }
    }
}
