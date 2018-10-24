
//Clase para realizar los registros de materia del dia lunes
package MiHorarioDeClases;

import java.io.*;
import javax.swing.*;

public class Lunes {
    
    public Lunes(){}
        
    public void registrarLunes(){
        
        File f=new File("Lunes.txt");
        
        try{
            
            FileWriter fw=new FileWriter(f);
            PrintWriter pw=new PrintWriter(fw);
            
            String materia[]=new String[9];
            
            pw.print("Lunes");
            pw.println();
            pw.println();
            for(int cuenta=3; cuenta<materia.length; cuenta++){
                                
                pw.print(cuenta*1+":00"+"-"+(cuenta*1+1)+":00  p.m|\t");
                pw.print(materia[cuenta]=JOptionPane.showInputDialog(null,"Ingrese materia:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                pw.println();
            }
                                          
                fw.close();
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"ocurrió un problema con el ingreso de datos...","MI HORARIO DE CLASES",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void imprimirMateriaLunes(){
        
        File f=new File("Lunes.txt");
        
        try{
            
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            
            String linea=br.readLine();
            String mensaje;
            mensaje=("Lunes\n\n");
            
            while(linea!=null){
                linea=br.readLine();
                mensaje=mensaje+linea+"\n";
                
            }
            JOptionPane.showMessageDialog(null,mensaje);    
                                    
            fr.close();
            br.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ocurrió un problema con la información...","MI HORARIO DE CLASES",JOptionPane.ERROR_MESSAGE);
        }
    }

}
