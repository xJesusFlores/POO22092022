/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;


import POO.Conceptos.Basicos.Automovil;
import java.awt.Color;

/**
 *
 * @author Flores
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        Persona per1 = new Persona();  // con new Persona () estamos invocando al metodo constructor, este meotodo se encarga de crear el objeto/variable 
       /* en memoria   per1 pudo haber sido cualquiera per1 de tipo Persona */
        per1.setNombre("Jesus Flores");
        
        System.out.println("Nombre: " +per1.getNombre ());   
        per1.comer("Hamburgesa hawaiana");
        
        Persona per2   = new Persona();
        per2.setNombre("Gerardo");
        System.out.println("Nombre per2: " +per2.getNombre());
        per2.comer("Pizza");
        
        System.out.println("\n");
        
        Automovil vocho = new Automovil ();
        vocho.setMarca("Volkswagen");
        vocho.setSubMarca("Sedan");
        vocho.setModelo( 1970);
        vocho.setColor(Color.yellow);
        System.out.println("Marca: " + vocho.getMarca());
        System.out.println("SubMarca: " + vocho.getSubMarca());
        System.out.println("Modelo: " + vocho.getModelo());
        System.out.println("Color: " + vocho.getColor());
        
        System.out.println("\n");
        
        Automovil mustang = new Automovil();
        mustang.setMarca("Ford");
        mustang.setSubMarca("Mustang");
        mustang.setModelo(2010);
        mustang.setColor(Color.blue);
       
        System.out.println("Marca: " + mustang.getMarca());
        System.out.println("SubMarca: " + mustang.getSubMarca());
        System.out.println("Modelo: " + mustang.getModelo());
        System.out.println("Color: " + mustang.getColor());
         /*mustang.avanzar(); */

        System.out.println("\n");
        
        Automovil akura = new Automovil ();
        akura.setMarca("Akura");
        akura.setSubMarca("NSX");
        akura.setModelo(2013);
        akura.setColor(Color.black);
        System.out.println("Marca: " + akura.getMarca());
        System.out.println("SubMarca: " +akura.getSubMarca());
        System.out.println("Modelo: " +akura.getModelo());
        System.out.println("Color: " + akura.getColor());

                System.out.println("\n");
    }
    

        
      
        
}
