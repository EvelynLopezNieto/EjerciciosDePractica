
package CalculoFigurasRegulares;

import javax.swing.JOptionPane;
import java.io.*;

public class Circulo extends PerimetroYArea {
    
    int radio;
    int diametro;
    
    public Circulo(){}
    
    public Circulo(int r,int d){
        this.radio=r;
        this.diametro=d;
    }
    
    public int obtenerRadio(){
        return radio;
    }
    
    public void cambiarRadio(int r){
        this.radio=r;
    }
    
    public int obtenerDiametro(){
        return diametro;
    }
    
    public void cambiarDiametro(int d){
        this.diametro=d;
    }
    
    @Override
    public void calcularPerimetro(){
        
        
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ha ingresado para calcular el perímetro del círculo.\n\n"
                + "Usted puede tener uno de dos datos.\n"
                + "Elija, del menú, el dato que usted tenga:\n\n    1. radio\n    "
                + "2. diametro\n    3. Regresar al menú principal","PEyAR GEOMETRIC     Perímetro del círculo",3));
        
        try{
        while(opcion<3){
            switch(opcion){
                case 1:
                    radio=Integer.parseInt(JOptionPane.showInputDialog(null,"Usted tiene un radio.\nIngrese el valor","Radio para el círculo",3));
                    
                    perimetro=2*radio*Math.PI;
                    
                    JOptionPane.showMessageDialog(null,"El perímetro de su círculo es:\n\n"+perimetro+" cm","Perímetro del círculo",3);
                    
                    opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija otra opción del menú.\n"
                + "Elija, del menú, el dato que usted tenga:\n\n    1. radio\n    2. diametro\n    3. Salir","PEy"
                        + "AR GEOMETRIC     Perímetro del círculo"));
        
                    break;
                
                case 2:
                    diametro=Integer.parseInt(JOptionPane.showInputDialog(null,"Usted tiene un diámetro\nIngrese el valor","Diámetro para el círculo",3));
                    
                    perimetro=Math.PI*diametro;
                    
                    JOptionPane.showMessageDialog(null,"El perímetro de su círculo es:\n\n"+perimetro+" cm","Perímetro del"
                            + "círculo",3);
                    
                    opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija otra opción del menú.\n"
                + "Elija, del menú, el dato que usted tenga:\n\n    1. radio\n    2. diametro\n    3. Salir","PEyAR GEOMETRIC      "
                        + "Perímetro del círculo",3));
        
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"");
                    
                default:
                    JOptionPane.showMessageDialog(null,"");
            }
        }
        
        if(opcion>3){
            JOptionPane.showMessageDialog(null,"        ¡¡ERROR!!\n\n\nLa opción no se encuentra en el menú...","ERROR",0);
        }
        
        JOptionPane.showMessageDialog(null,"Usted está saliendo...");
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Lo sentimos...Ha ocurrido un problema con el programa...\n\n"
                    + "o usted no ingresó un valor...","ERROR",0);
        }
    }
    
    @Override
    public void calcularArea(){
        
        int opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ha ingresado para calcular el área del círculo.\n\n"
                + "Usted puede tener uno de dos datos.\n"
                + "Elija, del menú, el dato que usted tenga:\n\n    1. radio\n    "
                + "2. diametro\n    3. Regresar al menú principal","PEyAR GEOMETRIC     Área del círulo",3));
        
        try{
        while(opcion<3){
            switch(opcion){
                case 1:
                    radio=Integer.parseInt(JOptionPane.showInputDialog(null,"Usted tiene un radio.\nIngrese el valor","Radio"
                            + "del círculo",3));
                    
                    area=radio*radio*Math.PI;
                    
                    JOptionPane.showMessageDialog(null,"El area de su círculo es:\n\n"+area+" cm^2","PEyAR GEOMETRIC     Área del círulo",3);
                    
                    opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija otra opción del menú.\n"
                + "Elija, del menú, el dato que usted tenga:\n\n    1. radio\n    "
                            + "2. diametro\n    3. Regresar al menú principal","PEyAR GEOMETRIC     Área del círulo",3));
        
                    break;
                
                case 2:
                    diametro=Integer.parseInt(JOptionPane.showInputDialog(null,"Usted tiene un diámetro\nIngrese el valor","Diámetro del círculo",3));
                    
                    area=Math.PI*( (diametro/2)*(diametro/2));
                    
                    JOptionPane.showMessageDialog(null,"El area de su círculo es:\n\n"+area+" cm^2","PEyAR GEOMETRIC     Área del círulo",3);
                    
                    opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija otra opción del menú.\n"
                + "Elija, del menú, el dato que usted tenga:\n\n    1. radio\n    "
                + "2. diametro\n    3. Regresar al menú principal","PEyAR GEOMETRIC     Área del círulo",3));
        
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"");
                    
                default:
                    JOptionPane.showMessageDialog(null,"");
            }
        }
        
        if(opcion>3){
            JOptionPane.showMessageDialog(null,"        ¡¡ERROR!!\n\n\nLa opción no se encuentra en el menú...","ERROR",0);
        }
        
        JOptionPane.showMessageDialog(null,"Usted está saliendo...");
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Lo sentimos...Ha ocurrido un problema con el programa...\n\n"
                    + "o usted no ingresó un valor...","ERROR",0);
        }
    }
}

/*class Principal{
    
    public static void main(String [] args){
        
        Circulo c=new Circulo();
        
        c.calcularPerimetro();
        c.calcularArea();
        
    }
}*/