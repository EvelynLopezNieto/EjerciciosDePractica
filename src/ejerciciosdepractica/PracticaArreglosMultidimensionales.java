
package ejerciciosdepractica;

import java.util.Scanner;

public class PracticaArreglosMultidimensionales {

    int arreglo[][]= {{1,2,3},{4,5,6}};
        
        
        public void imprimirArreglo(){
        for(int i=0; i<arreglo.length; i++){
                        
            for(int j=0; j<arreglo[i].length; j++){
                
                System.out.print(arreglo[i][j]);
            }
            System.out.println();
        }
        }

    public static void main(String[] args) {

        PracticaArreglosMultidimensionales arr=new PracticaArreglosMultidimensionales();
        
        //arr.imprimirArreglo();
        Scanner entrada=new Scanner(System.in);
        
        
        /*int matriz[][]=new int[3][3];
        
        for(int i=0; i<matriz.length; i++){
            
            for(int j=0; j<matriz[i].length; j++){
                
                System.out.println("Ingrese numero ["+i+"]"+"["+j+"]"+":");
                
                matriz[i][j]=entrada.nextInt();
            }
        }
                        
        System.out.println();
        
        for(int k=0; k<matriz.length; k++){
            
            for(int l=0; l<matriz[k].length; l++){
                
                System.out.print(matriz[k][l]+"\t");
            }
            System.out.println();
        }*/
        
        int arregloCadena[][][]=new int[2][2][2];
        
        for(int fila=0; fila<arregloCadena.length; fila++){
            
            for(int columna=0; columna<arregloCadena[fila].length; columna++){
                for(int alto=0; alto<arregloCadena[fila][columna].length; alto++){
                
                System.out.print("Ingrese cualquier numero:");
                arregloCadena[fila][columna][alto]=entrada.nextInt();
                }
            }
          
        }
        
        System.out.println("\n");
        for(int fila2=0; fila2<arregloCadena.length; fila2++){
            
            for(int columna2=0; columna2<arregloCadena[fila2].length; columna2++){
                for(int alto2=0; alto2<arregloCadena[fila2][columna2].length; alto2++){
                System.out.print(arregloCadena[fila2][columna2][alto2]+"\t");
                }
               System.out.println("\n"); 
            }
            
            System.out.println("\n");
        }
        }
        
}
            