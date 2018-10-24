
package CalculoFigurasRegulares;

import javax.swing.JOptionPane;
import java.io.*;

public class FigConMasDeCuatroLados extends PerimetroYArea {
    
    int numLados;
    int apotema;

    public FigConMasDeCuatroLados() {
    }

    public FigConMasDeCuatroLados(int numLados,int apotema) {
        this.numLados = numLados;
        this.apotema=apotema;
    }
    
    public int obtenerNumeroLados(){
        return numLados;
    }
    
    public void cambiarNumeroLados(int numLados){
        this.numLados=numLados;
    }
    
    public int obtenerApotema(){
        return apotema;
    }
    
    public void cambiarApotema(int apotema){
        this.apotema=apotema;
    }
    @Override
    public void calcularPerimetro(){
        
        try{
        numLados=Integer.parseInt(JOptionPane.showInputDialog(null,"Para calcular el perímetro, necesitamos que"
                + " ingreses\nel número de lados que tiene la figura:","PEyAR GEOMETRIC     Número de lados",3));
        
        lado=Integer.parseInt(JOptionPane.showInputDialog(null,"Ahora necesitamos que ingreses la\nmedida de uno"
                + " de sus lados","PEyAR GEOMETRIC     Lados",3));
        
        perimetro=numLados*lado;
        
        JOptionPane.showMessageDialog(null,"El perímetro de la figura es de:\n\n"+perimetro+" cm","PEyAR GEOMETRIC     "
                + "Perímetro para figuras con más de 4 lados",3);
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Lo sentimos, pero ocurrió un problema con el programa,"
                    + "\no no ingresó un valor en algún campo...","ERROR",0);
        
        }
        
    }
    
    @Override
    public void calcularArea(){
        
        try{
        numLados=Integer.parseInt(JOptionPane.showInputDialog(null,"Necesitamos que ingreses el número\nde lados"
                + " que tiene la figura","PEyAR GEOMETRIC     Número de lados",3));
        
        lado=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la medida de uno de sus lados","PEyAR GEOMETRIC     "
                + "Lado",3));
        
        perimetro=numLados*lado;
        
        apotema=Integer.parseInt(JOptionPane.showInputDialog(null,"Ahora,necesitamos que ingreses el valor\n"
                + "que tiene el apotema de la figura","PEyAR GEOMETRIC     Apotema",3));
        
        area=(perimetro*apotema)/2;
        
        JOptionPane.showMessageDialog(null,"El área de la figura es de:\n\n"+area+" cm^2","PEyAR GEOMETRIC     "
                + "Área de figuras con más de cuatro lados",3);
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Lo sentimos, pero ocurrió un problema con el programa,"
                    + "\no no ingresó un valor en algún campo...","ERROR",0);
            
        }
    }
}


/*class Ejecucion{
    
    public static void main(String [] args){
        
        FigConMasDeCuatroLados fig=new FigConMasDeCuatroLados();
        
        fig.calcularPerimetro();
        fig.calcularArea();
    }
}*/