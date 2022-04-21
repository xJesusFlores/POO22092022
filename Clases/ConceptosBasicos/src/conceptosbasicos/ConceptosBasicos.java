/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Alumno;
import ico.fes.Automovil;
import ico.fes.Persona;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author Flores
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hi");
        Silla s1 = new Silla();
        System.out.println(s1);  //Por defecto se invoca toString ()
        /*Class Object*/
        System.out.println(s1.toString());
        
        Automovil miBocho = new Automovil(); //Constructor **
        miBocho.setMarca("Volkswagen");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        
        System.out.println(miBocho);  //toString ();
        
        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow); /*Constructor Sobrecargado ** --Se declaran variables 
                                                                                        y al mismo tiempo se asignan valores  ejemplo: int a = 10 */
        System.out.println(miMustang);
        
        
        
        Automovil Akura = new Automovil("Akura", "NSX", 2013, Color.gray);
        System.out.println(Akura);
        
         /*Persona per1 = new Persona();
         per1.edad=20;  //edad has private access in Persona
         System.out.println(per1); */
         
         
         Persona per1 = new Persona ();
         per1.setEdad(22000);
         System.out.println(per1);
         
         Alumno a1 = new Alumno();  //contructor, getter and setter y to string  
         a1.setNombre("Jose");
         a1.setNumeroCuenta("245466-0");
         System.out.println(a1);  //
         
         
         
    }
    
    
}
