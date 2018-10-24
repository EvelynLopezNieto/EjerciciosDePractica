/*
Practica de arreglos con numeros
Evelyn Lopez Nieto
25/07/2018
7:30 pm
*/

package ejerciciosdepractica;

import java.util.*;
import javax.swing.JOptionPane;

public class PracticaArreglosConNumeros {
    
    public void tablaMultiplicar8(){
        int resultado;
        
        for(int contador=0; contador<=10; contador++){
            resultado=8*contador;
            System.out.println("8   x   "+contador+" =   "+resultado);
        }
    }
    
    public void tablaMultOpcional(){
        int resultado2;
        int multiplicando=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la tabla del número\n"
                + "que quieres ver:"));
        int multiplicador=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número que quieras para\n"
                + "multiplicar hasta ese número:"));
        
        for(int contador=0; contador<=multiplicador; contador++){
            resultado2=multiplicando*contador;
            
            System.out.println(multiplicando+"  x  "+contador+" =   "+resultado2);
        }
    }
        
    public static void main(String [] args){ 
        
        PracticaArreglosConNumeros tabla=new PracticaArreglosConNumeros();
        
        //tabla.tablaMultiplicar8();
        tabla.tablaMultOpcional();
        
        Scanner entrada=new Scanner(System.in);//objeto Scanner para ingresar valores por teclado
                        
        /*int arreglo2[]={34,5,68,13,26};//arreglo con valores predeterminados
        
        System.out.println("Indice\tValor");
        
        //impresion en pantalla del arreglo predeterminado utilizando un bucle for
        for(int contador=0; contador<arreglo2.length; contador++){
            
            System.out.println(contador+"\t"+arreglo2[contador]);
        }*/
        
        /*int arreglo[]=new int[5];//arreglo que no tiene valores predeterminados y hace espacio en la memoria
        
        //este bucle es para ingresar valores por teclado en el arreglo que tiene espacio en la memoria
        for(int i=0; i<arreglo.length; i++){
            
            System.out.println("Ingrese numero "+i+":");
            arreglo[i]=entrada.nextInt();
        }
        
        //impresion en pantalla de los valores ingresados en el arreglo con espacio
        System.out.println("\n\nIndice\tvalor");
        
        for(int j=0; j<arreglo.length; j++){
            
            System.out.println(j+"\t"+arreglo[j]);
        }
        
        //ejemplo de la suma de un arreglo utilizando el arreglo anterior
        int total=0;
        
        for(int contador2=0; contador2<arreglo.length; contador2++){
            
            total=total+arreglo[contador2];
        }
        
        System.out.println("La suma total de los números almacenados es de "+total);*/
    }
}
