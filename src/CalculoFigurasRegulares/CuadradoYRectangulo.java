
package CalculoFigurasRegulares;

import javax.swing.JOptionPane;

public class CuadradoYRectangulo extends PerimetroYArea {
    
    
    public CuadradoYRectangulo(){
        
    }
    
    @Override
    public void calcularPerimetro(){
        
        try{
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"El cuadrado y el rectagulo tienen 4 lados,\n"
                    + "pero sus perimetros no se obtienen de la misma forma.\n\nNecesitamos que elijas a cuál de\n"
                    + "las dos figuras te refieres.\n\n"
                    + "     1. Cuadrado\n     2. Rectagulo\n     "
                    + "3. Regresar al menú principal\n\n","PEyAR GEOMETRIC     Perímetro del cuadrado"
                            + " y el rectángulo",3));
            
            while(opcion<3){
                switch(opcion){
                    
                    case 1:
                        
                        base=Integer.parseInt(JOptionPane.showInputDialog(null,"Para el cuadrado solo necesitamos\n"
                                + "que ingreses el valor de uno de sus lados","PEyAR GEOMETRIC     "
                                        + "Base",3));
                        
                        perimetro=base*4;
                        
                        JOptionPane.showMessageDialog(null,"El perímetro del cuadrado es de:\n\n"+perimetro+" cm","PEyAR GEOMETRIC     "
                                + "Perímetro del cuadrado",3);
                        
                        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Necesitamos que elijas a cuál de\n"
                    + "las dos figuras te refieres.\n\n"
                    + "     1. Cuadrado\n     2. Rectagulo\n     "
                    + "3. Regresar al menú principal\n\n","PEyAR GEOMETRIC     Perímetro del cuadrado y el rectangulo",3));
                        
                        break;
                        
                    case 2:
                        
                        base=Integer.parseInt(JOptionPane.showInputDialog(null,"Para el rectángulo, ingresa el valor\n"
                                + "de la base","PEyAR GEOMETRIC     Base",3));
                        
                        altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ahora, ingresa el valor de la altura","PEyAR GEOMETRIC     "
                                + "Altura",3));
                        
                        perimetro=2*(base+altura);
                        
                        JOptionPane.showMessageDialog(null,"El perímetro del rectángulo es de:\n\n"+perimetro+" cm","PEyAR GEOMETRIC     "
                                + "Perímetro del rectangulo",3);
                        
                        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Necesitamos que elijas a cuál de\n"
                    + "las dos figuras te refieres.\n\n"
                    + "     1. Cuadrado\n     2. Rectagulo\n     3. Regresar al menú principal\n\n","PEyAR GEOMETRIC     "
                            + "Perímetro del cuadrado y el rectangulo",3));
                        
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null,"");
                        
                    default:
                        JOptionPane.showMessageDialog(null,"");
                }
            }
            
            if(opcion>3){
                
                JOptionPane.showMessageDialog(null,"    ¡¡ERROR!!\n\n"
                        + "Esta opción no existe en el menú...","ERROR",0);
            }
            
            JOptionPane.showMessageDialog(null,"Usted está saliendo...");
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Lo sentimos, ha ocurrido un problema con el programa"
                    + "o no ingresó información en algún campo...","ERROR",0);
            
        }
        
    }
    
    @Override
    public void calcularArea(){
        
        try{
        base=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor de la base","PEyAR GEOMETRIC     "
                + "Base",3));
        
        altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ahora, ingresa el valor de la altura","PEyAR GEOMETRIC     "
                + "Altura",3));
        
        area=base*altura;
        
        JOptionPane.showMessageDialog(null,"El área de la figura es de:\n\n"+area+" cm^2","PEyAR GEOMETRIC     "
                + "Área del cuadrado y el rectangulo",3);
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Lo sentimos, pero ocurrió un problema con el programa,\n"
                    + "o no ingresó un valor en algún campo...","ERROR",0);
            
        }
    }
}


/*class correr{
    
    public static void main(String [] args){
        
        CuadradoYRectangulo cr=new CuadradoYRectangulo();
        
        cr.calcularPerimetro();
        cr.calcularArea();
    }
}*/