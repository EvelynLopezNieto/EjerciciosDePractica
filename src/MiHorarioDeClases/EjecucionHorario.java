
package MiHorarioDeClases;

import javax.swing.*;
import java.io.*;

public class EjecucionHorario {

    public static void main(String[] args) {
        
        Lunes l=new Lunes();
        Martes m=new Martes();
        Miercoles mi=new Miercoles();
        Jueves j=new Jueves();
        Viernes v=new Viernes();
        
        int opcion;
        
        try{
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "¡BIENVENIDO A TU "
                + "HORARIO DE CLASES!\n\nTenemos las siguientes opciones\npara ti. Si todavía "
                + "no tienes registradas\ntus materias, te sugerimos la primera opción.\n\n"
                + "1. Registrar las materias por día\n"
                + "2. Modificar el horario de un día\n"
                + "3. Revisar las clases que me tocan en el día\n"
                + "4. Salir del programa\n\n"
                + "Introduce tu opción:", "MI HORARIO DE CLASES", JOptionPane.PLAIN_MESSAGE));
        
        
        while(opcion<4){
            
            switch(opcion){
                
                case 1:
                    
                    try{
                    
                    JOptionPane.showMessageDialog(null,"Ha ingresado al registro de sus materias","MI HORARIO DE CLASES",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null,"Ingrese sus materias del día Lunes...","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE);
                    l.registrarLunes();
                    JOptionPane.showMessageDialog(null,"Ingrese sus materias del día Martes...","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE);
                    m.registrarMartes();
                    JOptionPane.showMessageDialog(null,"Ingrese sus materias del día Miércoles...","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE);
                    mi.registrarMiercoles();
                    JOptionPane.showMessageDialog(null,"Ingrese sus materias del día Jueves...","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE);
                    j.registrarJueves();
                    JOptionPane.showMessageDialog(null,"Ingrese sus materias del día Viernes...","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE);
                    v.registrarViernes();
                    
                    opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "¡BIENVENIDO A TU "
                + "HORARIO DE CLASES!\n\nTenemos las siguientes opciones\npara ti. Si todavía "
                + "no tienes registradas\ntus materias, te sugerimos la primera opción.\n\n"
                + "1. Registrar las materias por día\n"
                + "2. Modificar el horario de un día\n"            
                + "3. Revisar las clases que me tocan en el día\n"
                + "4. Salir del programa\n\n"
                + "Introduce tu opción:", "MI HORARIO DE CLASES", JOptionPane.PLAIN_MESSAGE));
                    }
                    
                    catch(Exception e){
                        
                        JOptionPane.showMessageDialog(null,"Le faltó ingresar algún un dato...","MI HORARIO DE CLASES",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    break;
                    
                case 2:
                    
                    JOptionPane.showMessageDialog(null,"Ha ingresado para modificar el horario de un día...","MI HORARIO DE CLASES",JOptionPane.INFORMATION_MESSAGE);
                    
                    int opcion3;
                    
                    try{
                        
                        opcion3=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere modificar.\n\n"
                                + "1. Lunes\n2. Martes\n3. Miércoles\n"
                                + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                                + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                        
                        while(opcion3<6){
                            switch(opcion3){
                                
                                case 1:
                                    
                                    l.registrarLunes();
                                    
                                    opcion3=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere modificar.\n\n"
                                + "1. Lunes\n2. Martes\n3. Miércoles\n"
                                + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                                + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                    
                                    break;
                                    
                                case 2:
                                    
                                    m.registrarMartes();
                                    
                                    opcion3=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere modificar.\n\n"
                                + "1. Lunes\n2. Martes\n3. Miércoles\n"
                                + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                                + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                    
                                    break;
                                    
                                case 3:
                                    
                                    mi.registrarMiercoles();
                                    
                                    opcion3=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere modificar.\n\n"
                                + "1. Lunes\n2. Martes\n3. Miércoles\n"
                                + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                                + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                    
                                    break;
                                    
                                case 4:
                                    
                                    j.registrarJueves();
                                    
                                    opcion3=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere modificar.\n\n"
                                + "1. Lunes\n2. Martes\n3. Miércoles\n"
                                + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                                + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                    
                                    break;
                                    
                                case 5:
                                    
                                    v.registrarViernes();
                                    
                                    opcion3=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere modificar.\n\n"
                                + "1. Lunes\n2. Martes\n3. Miércoles\n"
                                + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                                + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                    
                                    break;
                                    
                                case 6:
                                    JOptionPane.showMessageDialog(null,"");
                                default:
                                    JOptionPane.showMessageDialog(null,"");
                            }
                        }
                        
                        if(opcion>6){
                            JOptionPane.showMessageDialog(null,"¡ERROR!... Esta opción no existe en el menú","MI HORARIO DE CLASES",JOptionPane.ERROR_MESSAGE);
                        }
                        opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "¡BIENVENIDO A TU "
                + "HORARIO DE CLASES!\n\nTenemos las siguientes opciones\npara ti. Si todavía "
                + "no tienes registradas\ntus materias, te sugerimos la primera opción.\n\n"
                + "1. Registrar las materias por día\n"
                + "2. Modificar el horario de un día\n"            
                + "3. Revisar las clases que me tocan en el día\n"
                + "4. Salir del programa\n\n"
                + "Introduce tu opción:", "MI HORARIO DE CLASES", JOptionPane.PLAIN_MESSAGE));
                    }
                    
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un problema con el programa...","MI HORARIO DE CLASES",JOptionPane.ERROR_MESSAGE);
                    }
                
                case 3:
                    
                    JOptionPane.showMessageDialog(null,"Ha ingresado para revisar las clases del día...","MI HORARIO DE CLASES",JOptionPane.INFORMATION_MESSAGE);
                    
                    int opcion2;
                    
                    try{
                        
                    
                    opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere\n"
                            + "revisar las clases que te tocan.\n\n"
                            + "1. Lunes\n2. Martes\n3. Miércoles\n"
                            + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                            + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                    
                    while(opcion2<6){
                        
                        switch(opcion2){
                            
                            case 1:
                                
                                l.imprimirMateriaLunes();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere\n"
                            + "revisar las clases que te tocan.\n\n"
                            + "1. Lunes\n2. Martes\n3. Miércoles\n"
                            + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                            + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                break;
                                
                            case 2:
                                
                                m.imprimirMateriaMartes();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere\n"
                            + "revisar las clases que te tocan.\n\n"
                            + "1. Lunes\n2. Martes\n3. Miércoles\n"
                            + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                            + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                break;
                                
                            case 3:
                                
                                mi.imprimirMateriaMiercoles();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere\n"
                            + "revisar las clases que te tocan.\n\n"
                            + "1. Lunes\n2. Martes\n3. Miércoles\n"
                            + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                            + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                break;
                                
                            case 4:
                                
                                j.imprimirMateriaJueves();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere\n"
                            + "revisar las clases que te tocan.\n\n"
                            + "1. Lunes\n2. Martes\n3. Miércoles\n"
                            + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                            + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                break;
                                
                            case 5:
                                
                                v.imprimirMateriaViernes();
                                
                                opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija del menú, el día que quiere\n"
                            + "revisar las clases que te tocan.\n\n"
                            + "1. Lunes\n2. Martes\n3. Miércoles\n"
                            + "4. Jueves\n5. Viernes\n6. Regresar al menú principal\n\n"
                            + "Ingresa la opción que elegiste:","MI HORARIO DE CLASES",JOptionPane.PLAIN_MESSAGE));
                                break;
                                
                            case 6:
                                
                                JOptionPane.showMessageDialog(null,"");
                                
                            default:
                                JOptionPane.showMessageDialog(null,"");
                        }
                    }
                    
                    if(opcion2>6){
                        
                        JOptionPane.showMessageDialog(null,"¡ERROR! esta opción no existe en el menú...","MI HORARIO DE CLASES",JOptionPane.ERROR_MESSAGE);
                    }
                    
                    opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "¡BIENVENIDO A TU "
                + "HORARIO DE CLASES!\n\nTenemos las siguientes opciones\npara ti. Si todavía "
                + "no tienes registradas\ntus materias, te sugerimos la primera opción.\n\n"
                + "1. Registrar las materias por día\n"
                + "2. Modificar el horario de un día\n"            
                + "3. Revisar las clases que me tocan en el día\n"
                + "4. Salir del programa\n\n"
                + "Introduce tu opción:", "MI HORARIO DE CLASES", JOptionPane.PLAIN_MESSAGE));
                    }
                    
                    catch(Exception e){
                        
                        JOptionPane.showMessageDialog(null,"Le faltó ingresar algún dato...","MI HORARIO DE CLASES",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                    
                case 4:
                    
                    JOptionPane.showMessageDialog(null,"");
                    
                default:
                    JOptionPane.showMessageDialog(null,"");
            }
        }
        
        if(opcion>4){
            
            JOptionPane.showMessageDialog(null,"¡ERROR! esta opción no existe...","MI HORARIO DE CLASES",JOptionPane.ERROR_MESSAGE);
        }
        
        JOptionPane.showMessageDialog(null,"Saliendo del programa...\n\n"
                + "Te esperamos en la siguiente ocasión.\n¡GRACIAS!","MI HORARIO DE CLASES",JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Ocurrió un problema con la ejecución del programa...","MI HORARIO DE CLASES",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
