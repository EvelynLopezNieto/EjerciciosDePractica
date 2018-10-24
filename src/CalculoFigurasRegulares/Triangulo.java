
package CalculoFigurasRegulares;

import javax.swing.JOptionPane;

public class Triangulo extends PerimetroYArea {
    
    public Triangulo(){
        
    }
    
    
    @Override
    public void calcularPerimetro(){
        
        
    }
    
    @Override
    public void calcularArea(){
        
        try{
        base=Integer.parseInt(JOptionPane.showInputDialog(null,"Necesitamos que ingreses el valor de"
                + " la base del triángulo","PEyAR GEOMETRIC     Base del triángulo",3));
        
        altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ahora, ingresa el valor de la altura"
                + " del triángulo","PEyAR GEOMETRIC     Altura del triángulo",3));
        
        area=(base*altura)/2;
        
        JOptionPane.showMessageDialog(null,"El área del triángulo es de:\n\n"+area+" cm^2","PEyAR GEOMETRIC     "
                + "Área del triángulo",3);
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Lo sentimos, pero ocurrió un problema con el programa,"
                    + " o no ingresó un valor en algún campo...","ERROR",0);
            
        }
    }
}


/*class implementacion{
    
    public static void main(String [] args){
        
        Triangulo t=new Triangulo();
        
        t.calcularArea();
    }
}*/