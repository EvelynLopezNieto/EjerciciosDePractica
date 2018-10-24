
package ejerciciosdepractica;

import java.io.*;
import javax.swing.JOptionPane;


public class LecturaDeBuffer {

    
    public LecturaDeBuffer(){}
    
    public void registro(){
        File ar=new File("prueba.txt");
        
        try{
            
            FileWriter fw=new FileWriter(ar);
            PrintWriter pw=new PrintWriter(fw);
            
            int numMat;
            String materia[]=new String[numMat=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de materias a registrar:"))];
            
            pw.print("Lunes");
            pw.println();
            pw.println();
            for(int i=0; i<materia.length; i++){
                
                
                pw.print(materia[i]=JOptionPane.showInputDialog("Ingrese materia "+i));
                pw.println();
                
            }
                        
            fw.close();
            
        }
        
        catch(Exception e){
            System.out.println("hay un problema con el archivo...");
        }
    }
    
    public void impresion(){
        
        File ar2=new File("prueba.txt");
        
        try{
            
            FileReader fr=new FileReader(ar2);
            BufferedReader br=new BufferedReader(fr);
            
            String materia[]=new String[6];
            
            String linea=br.readLine();
            
            System.out.println("Lunes");
            while(linea!=null){
                
                linea=br.readLine();
                                
                System.out.println(linea);
            }
            
            fr.close();
        }
        
        catch(Exception e){
            
        }
    }
    
    public static void main(String[] args) {
        
        LecturaDeBuffer lectura=new LecturaDeBuffer();
        
        //lectura.registro();
        //lectura.impresion();
        
        
        String frecuencia[]=new String[10];
        
        for(int cuenta=7; cuenta<frecuencia.length; cuenta++){
            
            frecuencia[cuenta]=JOptionPane.showInputDialog(null,cuenta*1+":00"+"-"+(cuenta*1+":"+0.5+"0")+"  p.m|\n\n");
            
        }
    }
    
}
