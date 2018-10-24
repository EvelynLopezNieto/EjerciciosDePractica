
package ejerciciosdepractica;

import javax.swing.JOptionPane;

public class ComparacionCadenas {
        String nomUsuario;
        String usuario;
        int contrasena;
        int pass;

        public void registro(){
            
            nomUsuario=JOptionPane.showInputDialog("Ingrese su nombre para registrarse:");
            contrasena=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contrasena para registrarse:"));
        
        }
        
        public void entrada(){
           
            usuario=JOptionPane.showInputDialog("Ingrese su nombre para ingresar:");
            //pass=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña para ingresar:"));
            
            if(usuario.equals(nomUsuario)){
                pass=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña para ingresar:"));
                
                if(pass==contrasena){
                    JOptionPane.showMessageDialog(null,"Ingresando...");
                }
                else{
                    while(pass!=contrasena){
                        JOptionPane.showMessageDialog(null,"Su contraseña es incorrecta...");
                      pass=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña para ingresar:"));  
                    }
                }
            }
            else{
                while(usuario!=nomUsuario){
                    
                    JOptionPane.showMessageDialog(null,"Su nombre de usuario es incorrecto...");
                    usuario=JOptionPane.showInputDialog("Ingrese su nombre para ingresar:");
                    
                }
                                    
            }
        }
    public static void main(String[] args) {

        ComparacionCadenas com=new ComparacionCadenas();
        
        com.registro();
        com.entrada();
        
    }
    
}
