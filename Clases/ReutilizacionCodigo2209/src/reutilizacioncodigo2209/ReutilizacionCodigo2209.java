/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import javax.swing.JFrame;

/**
 *
 * @author Flores
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3 ));
        System.out.println(nombre.toUpperCase());
        
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(false); //or true
        
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        //miCompu.setCpu (new Procesador ("Intel", 2.7f));
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        
        System.out.println(miCompu);
        
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //Ejercicio: establecer un mouse marca Logitech del tipo optico
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        //miCompu.getRaton().setMarca("Logitech").se
        
        Computadora compu2 = new Computadora("Apple", "MacBook Pro", 
                new Monitor("Toshiba", 17.4f),
                new Procesador("M1", 3.4f),
                new Mouse("Acteck", "Optico"),
                new Teclado("M1", 101));
        

        System.out.println(compu2);
        
        //Ejercicio: establecer; mouse apple y tipo touch
        //compu2.setRaton(new Mouse("Apple", "Tocuh"));  /*Alternativa
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
                System.out.println(compu2);
        System.out.println("\n---------------------------\n");
        
        Alumno alu1 = new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);  
        
        Alumno alu2 = new Alumno("465534-4", "ICO", "Jose Perez", 19);
        System.out.println(alu2);
    }
    
}
