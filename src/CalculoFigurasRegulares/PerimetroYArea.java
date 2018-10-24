
package CalculoFigurasRegulares;


public abstract class PerimetroYArea {
    
    int lado;
    int base;
    int altura;
    double perimetro;
    double area;
    int opcion;
    
    public abstract void calcularPerimetro();
    
    public abstract void calcularArea();
}
