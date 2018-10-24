
package ejerciciosdepractica;

import javax.swing.JOptionPane;

public class DialogoNombre {
 
    public static void main(String [] args){
        
        String nombre=JOptionPane.showInputDialog("¿Cuál es su nombre?");
        
        String mensaje=String.format("Bienvenido "+nombre+" a la programación en Java.");
        
        //JOptionPane.showMessageDialog(null,"Bienvenido(a) "+nombre+" a la programación en Java");
        
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
