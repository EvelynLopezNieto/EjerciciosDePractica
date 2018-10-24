
package CalculoFigurasRegulares;

import java.io.*;
import javax.swing.JOptionPane;

public class Comentario {
    
    String comentario;
    
    public void comentario(){
        
        File f=new File("Comentarios.txt");
        
        try{
            
            FileWriter fw=new FileWriter(f,true);
            PrintWriter pw=new PrintWriter(fw);
            
                        
            pw.write(comentario=JOptionPane.showInputDialog(null,"¿Qué te pareció PEyAR GEOMETRIC?",3));
            pw.println();
            pw.println();
            
            fw.close();
            
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Ocurrió un error con el archivo...");
        }
    }
}

class principal{
    
    public static void main(String [] args){
        
        Comentario com=new Comentario();
        
        //JOptionPane.showConfirmDialog(null, "Su ejecucion a sido exitosa...");
        JOptionPane.showInputDialog("hola", "es otra cosa...");
        JOptionPane.showInputDialog(null, "hola", "aqui estoy",3);
        //JOptionPane.showMessageDialog(null, "adios", "que es esto", 3);
        
        
    }
}