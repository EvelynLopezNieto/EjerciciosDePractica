
package MiHorarioDeClases;

import javax.swing.*;
import java.io.*;

public class Viernes {
    
    public Viernes(){}
    
    public void registrarViernes(){
        
        File f=new File("Viernes.txt");
        
        try{
            
            FileWriter fw=new FileWriter(f);
            PrintWriter pw=new PrintWriter(fw);
            
            String materia[]=new String[9];
            
            pw.print("Viernes");
            pw.println();
            pw.println();
            
            for(int lugar=3; lugar<materia.length; lugar++){
                
                pw.print(lugar*1+":00-"+(lugar*1+1)+":00  p.m|\t");
                pw.print(materia[lugar]=JOptionPane.showInputDialog(null,"Ingrese materia:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                pw.println();
            }
            
            fw.close();
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al ingresar información...", "MI HORARIO DE CLASES",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void imprimirMateriaViernes(){
        
        File f=new File("Viernes.txt");
        
        try{
            
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            
            String linea=br.readLine();
            String mensaje;
            mensaje=("Viernes\n\n");
          
            while(linea!=null){
                linea=br.readLine();
                mensaje=mensaje+linea+"\n";
        
            }
            JOptionPane.showMessageDialog(null,mensaje);
            
            fr.close();
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Ocurrió un problema al mostrar la información","MI HORARIO DE CLASES",JOptionPane.ERROR_MESSAGE);
        }
    }
}
