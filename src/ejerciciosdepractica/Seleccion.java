
package ejerciciosdepractica;

import javax.swing.JOptionPane;

public class Seleccion {
    
    String nombre;
    int materia;
    int numAlumnos;
    int cal;
    double promedio;
    
    public void pedirNombre(){
        nombre=JOptionPane.showInputDialog("Ingrese su nombre completo: ");
    }
    
    public void mostrarMensaje(){
        JOptionPane.showMessageDialog(null,"Bienvenido(a) "+nombre+" al programa...");
    }
    
    /*public void pedirMateria(){
        numAlumnos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de alumnos que va a registrar"));
        
        materia1=JOptionPane.showInputDialog("Ingrese nombre de la materia");
        materia2=JOptionPane.showInputDialog("Ingrese nombre de la materia");
        materia3=JOptionPane.showInputDialog("Ingrese nombre de la materia");
        materia4=JOptionPane.showInputDialog("Ingrese nombre de la materia");
        materia5=JOptionPane.showInputDialog("Ingrese nombre de la materia");
        materia6=JOptionPane.showInputDialog("Ingrese nombre de la materia");
        
    }*/
    
    public void pedirCalificacion(){
        
        numAlumnos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos que va a registrar"));
        materia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de materias que registrará"));
        
        
        for(int i=1; i<=numAlumnos; i++){
            for(int k=1; k<=materia; k++){
            cal=Integer.parseInt(JOptionPane.showInputDialog("Ingrese calificación "+k));
            //cal2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese calificación "+i));
            //cal3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese calificación "+i));
            //cal4=Integer.parseInt(JOptionPane.showInputDialog("Ingrese calificación "+i));
            //cal5=Integer.parseInt(JOptionPane.showInputDialog("Ingrese calificación "+i));
            //cal6=Integer.parseInt(JOptionPane.showInputDialog("Ingrese calificación "+i));
            
            }
        }
        
    }
    
    public void imprimirCalificacion(){
        
        promedio=cal/6;
        
        int numAlumnos2;
        
        numAlumnos2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos que va a registrar"));
        
        for(int j=1; j<=numAlumnos2; j++){
        
            if(promedio>=70){
                JOptionPane.showMessageDialog(null,"CALIFICACIONES OBTENIDAS\n\nMATERIA     "+"     CALIFICACION\n\n"
                +"");
            }
        }
                
    }
}


class Principal{
    
    
    public static void main(String [] args){
        
        Seleccion promedioAlumno=new Seleccion();
        
        promedioAlumno.pedirNombre();
        promedioAlumno.mostrarMensaje();
        //promedioAlumno.pedirMateria();
        promedioAlumno.pedirCalificacion();
        promedioAlumno.imprimirCalificacion();
        
        
    }
}
