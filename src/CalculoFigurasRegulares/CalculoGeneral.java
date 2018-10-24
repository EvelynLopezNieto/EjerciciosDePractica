
package CalculoFigurasRegulares;

import javax.swing.JOptionPane;

public class CalculoGeneral {

    
    public static void main(String[] args) {
        
        int opcion;
        int opcion2;
        
        Circulo c=new Circulo();
        FigConMasDeCuatroLados fmas=new FigConMasDeCuatroLados();
        Triangulo t=new Triangulo();
        CuadradoYRectangulo cr=new CuadradoYRectangulo();
        Comentario com=new Comentario();
        
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"¡¡BIENVENIDO(A) A PEyAR GEOMETRIC!!\n\n"
                + "Este programa es una herramienta desarrollada para que te facilite\n"
                + "el cálculo de perímetros y áreas de los polígonos regulares más\n"
                + "importantes. Esperamos que sea de tu agrado y te pueda servir.\n\n"
                + "Como el programa está en pruebas, te pedimos tu colaboración y\n"
                + "necesitamos que nos des tu opinión sobre el programa, y que nos\n"
                + "digas si tiene algún defecto, error o quieres que tenga más\n"
                + "características.\n\n\n"
                + "Para comenzar, te presentamos el siguiente menú. Selecciona una de\n"
                + "las opciones que necesites para ingresar tus datos y hacer el cálculo.\n\n"
                + "1. Calcular perímetro\n2. Calcular área\n3. Escribir un comentario\n4. Salir del programa\n\n"
                + "Ingresa tu opción:","PEyAR GEOMETRIC",3));
        
        try{
        while(opcion<4){
            
            switch(opcion){
                
                case 1:
                    
                    opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresaste a la opción de calcular el perímetro\n"
                            + "de una figura. Para calcular el perímetro de las figuras,\n"
                            + "no se realiza de la misma forma. Así que te presentamos\n"
                            + "el siguiente menú para que elijas a la figura que necesitas\n"
                            + "conocer su perímetro.\n\n"
                            + "1. Círculo\n2. Rectangulo o cuadrado\n3. Polígonos con más de 4 lados(puedes incluir al triangulo)\n"
                            + "4. Regresar al menú principal\n\n"
                            + "Ingresa tu opción:","PEyAR GEOMETRIC     Cálculo del perímetro",3));
                    
                    try{
                    while(opcion2<4){
                        
                        switch(opcion2){
                            
                            case 1:
                                
                                c.calcularPerimetro();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresaste a la opción de calcular el perímetro\n"
                            + "de una figura. Para calcular el perímetro de las figuras,\n"
                            + "no se realiza de la misma forma. Así que te presentamos\n"
                            + "el siguiente menú para que elijas a la figura que necesitas\n"
                            + "conocer su perímetro.\n\n"
                            + "1. Círculo\n2. Rectangulo o cuadrado\n3. Polígonos con más de 4 lados(puedes incluir al triangulo)\n"
                            + "4. Regresar al menú principal\n\n"
                            + "Ingresa tu opción:","PEyAR GEOMETRIC     Cálculo del perímetro",3));
                                
                                break;
                                
                            case 2:
                                
                                cr.calcularPerimetro();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresaste a la opción de calcular el perímetro\n"
                            + "de una figura. Para calcular el perímetro de las figuras,\n"
                            + "no se realiza de la misma forma. Así que te presentamos\n"
                            + "el siguiente menú para que elijas a la figura que necesitas\n"
                            + "conocer su perímetro.\n\n"
                            + "1. Círculo\n2. Rectangulo o cuadrado\n3. Polígonos con más de 4 lados(puedes incluir al triangulo)\n"
                            + "4. Regresar al menú principal\n\n"
                            + "Ingresa tu opción:","PEyAR GEOMETRIC     Cálculo del perímetro",3));
                                
                               break;
                            
                            case 3:
                                
                                fmas.calcularPerimetro();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresaste a la opción de calcular el perímetro\n"
                            + "de una figura. Para calcular el perímetro de las figuras,\n"
                            + "no se realiza de la misma forma. Así que te presentamos\n"
                            + "el siguiente menú para que elijas a la figura que necesitas\n"
                            + "conocer su perímetro.\n\n"
                            + "1. Círculo\n2. Rectangulo o cuadrado\n3. Polígonos con más de 4 lados(puedes incluir al triangulo)\n"
                            + "4. Regresar al menú principal\n\n"
                            + "Ingresa tu opción:","PEyAR GEOMETRIC     Cálculo del perímetro",3));
                            
                            break;
                            
                            case 4:
                                
                                JOptionPane.showMessageDialog(null,"");
                                
                            default:
                                JOptionPane.showMessageDialog(null,"");
                        }
                    }
                    
                    if(opcion>4){
                        
                        JOptionPane.showMessageDialog(null,"    ¡¡ERROR!!\n\n"
                                + "Esta opción no existe en el menú...","ERROR",0);
                    }
                    
                    JOptionPane.showMessageDialog(null,"Usted está saliendo...");
                    
                    opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"¡¡BIENVENIDO(A) A PEyAR GEOMETRIC!!\n\n"
                + "Este programa es una herramienta desarrollada para que te facilite\n"
                + "el cálculo de perímetros y áreas de los polígonos regulares más\n"
                + "importantes. Esperamos que sea de tu agrado y te pueda servir.\n\n"
                + "Como el programa está en pruebas, te pedimos tu colaboración y\n"
                + "necesitamos que nos des tu opinión sobre el programa, y que nos\n"
                + "digas si tiene algún defecto, error o quieres que tenga más\n"
                + "características.\n\n\n"
                + "Para comenzar, te presentamos el siguiente menú. Selecciona una de\n"
                + "las opciones que necesites para ingresar tus datos y hacer el cálculo.\n\n"
                + "1. Calcular perímetro\n2. Calcular área\n3. Escribir un comentario\n4. Salir del programa\n\n"
                + "Ingresa tu opción:","PEyAR GEOMETRIC",3));
                    }
                    
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Lo sentimos, ocurrió un problemas con el programa\n"
                                + "o no ingresó valor en algún campo...","ERROR",0);
                    }
                    
                    break;
                    
                case 2:
                    
                    opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresaste a la opción de calcular el área\n"
                            + "de una figura. Para calcular el área de las figuras,\n"
                            + "no se realiza de la misma forma. Así que te presentamos\n"
                            + "el siguiente menú para que elijas a la figura que necesitas\n"
                            + "conocer su área.\n\n"
                            + "1. Círculo\n2. Triangulo\n3. Cuadrado o rectangulo\n4. Polígonos con más de 4 lados\n"
                            + "5. Regresar al menú principal\n\n"
                            + "Ingresa tu opción:","PEyAR GEOMETRIC     Cálculo del área",3));
                    
                    try{
                    while(opcion2<5){
                        
                        switch(opcion2){
                            
                            case 1:
                                
                                c.calcularArea();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresaste a la opción de calcular el área\n"
                            + "de una figura. Para calcular el área de las figuras,\n"
                            + "no se realiza de la misma forma. Así que te presentamos\n"
                            + "el siguiente menú para que elijas a la figura que necesitas\n"
                            + "conocer su área.\n\n"
                            + "1. Círculo\n2. Triangulo\n3. Cuadrado o rectangulo\n4. Polígonos con más de 4 lados\n"
                            + "5. Regresar al menú principal\n\n"
                            + "Ingresa tu opción:","PEyAR GEOMETRIC     Cálculo del área",3));
                                break;
                                
                            case 2:
                                
                                t.calcularArea();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresaste a la opción de calcular el área\n"
                            + "de una figura. Para calcular el área de las figuras,\n"
                            + "no se realiza de la misma forma. Así que te presentamos\n"
                            + "el siguiente menú para que elijas a la figura que necesitas\n"
                            + "conocer su área.\n\n"
                            + "1. Círculo\n2. Triangulo\n3. Cuadrado o rectangulo\n4. Polígonos con más de 4 lados\n"
                            + "5. Regresar al menú principal\n\n"
                            + "Ingresa tu opción:","PEyAR GEOMETRIC     Cálculo del área",3));
                                
                                break;
                                
                            case 3:
                                
                                cr.calcularArea();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresaste a la opción de calcular el área\n"
                            + "de una figura. Para calcular el área de las figuras,\n"
                            + "no se realiza de la misma forma. Así que te presentamos\n"
                            + "el siguiente menú para que elijas a la figura que necesitas\n"
                            + "conocer su área.\n\n"
                            + "1. Círculo\n2. Triangulo\n3. Cuadrado o rectangulo\n4. Polígonos con más de 4 lados\n"
                            + "5. Regresar al menú principal\n\n"
                            + "Ingresa tu opción:","PEyAR GEOMETRIC     Cálculo del área",3));
                                
                                break;
                                
                            case 4:
                                
                                fmas.calcularArea();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresaste a la opción de calcular el área\n"
                            + "de una figura. Para calcular el área de las figuras,\n"
                            + "no se realiza de la misma forma. Así que te presentamos\n"
                            + "el siguiente menú para que elijas a la figura que necesitas\n"
                            + "conocer su área.\n\n"
                            + "1. Círculo\n2. Triangulo\n3. Cuadrado o rectangulo\n4. Polígonos con más de 4 lados\n"
                            + "5. Regresar al menú principal\n\n"
                            + "Ingresa tu opción:","PEyAR GEOMETRIC     Cálculo del área",3));
                                
                                break;
                                
                            case 5:
                                
                                JOptionPane.showMessageDialog(null,"");
                                
                            default:
                                JOptionPane.showMessageDialog(null,"");
                        }
                    }
                    
                    if(opcion>5){
                        
                        JOptionPane.showMessageDialog(null,"    ¡¡ERROR!!\n\n"
                                + "Esta opción no existe en el menú...","ERROR",0);
                    }
                    
                    JOptionPane.showMessageDialog(null,"Usted está saliendo...");
                    
                    opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"¡¡BIENVENIDO(A) A PEyAR GEOMETRIC!!\n\n"
                + "Este programa es una herramienta desarrollada para que te facilite\n"
                + "el cálculo de perímetros y áreas de los polígonos regulares más\n"
                + "importantes. Esperamos que sea de tu agrado y te pueda servir.\n\n"
                + "Como el programa está en pruebas, te pedimos tu colaboración y\n"
                + "necesitamos que nos des tu opinión sobre el programa, y que nos\n"
                + "digas si tiene algún defecto, error o quieres que tenga más\n"
                + "características.\n\n\n"
                + "Para comenzar, te presentamos el siguiente menú. Selecciona una de\n"
                + "las opciones que necesites para ingresar tus datos y hacer el cálculo.\n\n"
                + "1. Calcular perímetro\n2. Calcular área\n3. Escribir un comentario\n4. Salir del programa\n\n"
                + "Ingresa tu opción:","PEyAR GEOMETRIC",3));
                    }
                    
                    catch(Exception e){
                        
                        JOptionPane.showMessageDialog(null,"Lo sentimos, ocurrió un problema con\n"
                                + "el programa, o usted no ingresó valor en un campo...","ERROR",0);
                    }
                    
                    break;
                    
                case 3:
                    
                    com.comentario();
                    
                    opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"¡¡BIENVENIDO(A) A PEyAR GEOMETRIC!!\n\n"
                + "Este programa es una herramienta desarrollada para que te facilite\n"
                + "el cálculo de perímetros y áreas de los polígonos regulares más\n"
                + "importantes. Esperamos que sea de tu agrado y te pueda servir.\n\n"
                + "Como el programa está en pruebas, te pedimos tu colaboración y\n"
                + "necesitamos que nos des tu opinión sobre el programa, y que nos\n"
                + "digas si tiene algún defecto, error o quieres que tenga más\n"
                + "características.\n\n\n"
                + "Para comenzar, te presentamos el siguiente menú. Selecciona una de\n"
                + "las opciones que necesites para ingresar tus datos y hacer el cálculo.\n\n"
                + "1. Calcular perímetro\n2. Calcular área\n3. Escribir un comentario\n4. Salir del programa\n\n"
                + "Ingresa tu opción:","PEyAR GEOMETRIC",3));
                    
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null,"");
                    
                default:
                    
                    JOptionPane.showMessageDialog(null,"");
            }
        }
        
        if(opcion>4){
            
            JOptionPane.showMessageDialog(null,"    ¡¡ERROR!!\n\n"
                    + "Esta opción no se encuentra en el menú...","ERROR",0);
        }
        
        JOptionPane.showMessageDialog(null,"Usted está saliendo del programa...\n\n\n"
                + "PEyAR GEOMETRIC  y nosotros le agradecemos por haber\n"
                + " utilizado el programa. Esperamos que le haya gustado.\n\n"
                + "¡¡TE ESPERAMOS EN OTRA OCASIÓN!!","      PEyAR GEOMETRIC     ",3);
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Lo sentimos, pero ocurrió un problema\n"
                    + "con el programa, o no ingresó un valor el algún campo...","ERROR",0);
        }
}
    
}
