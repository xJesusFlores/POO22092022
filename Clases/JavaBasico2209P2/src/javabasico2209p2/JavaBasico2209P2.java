/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209p2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jesus Flores
 */
public class JavaBasico2209P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> nombres = new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres) {
            System.out.println(nombre);
            
            
        }
        System.out.println("--------------");
        System.out.println(nombres.get(3)); 
            Scanner sc = new Scanner(System.in);
            //int seleccion = sc.nextInt();
        String nombre = "";
        int seleccion = 0;
        try {
            seleccion = sc.nextInt(); // importante el orden
            nombre = nombres.get(seleccion);
             
                   
        } catch(InputMismatchException ie){  //Agrupar catch exeption
            System.out.println("Debes ingresar valores numéricos");
            nombre = nombres.get(0);
        }catch(IndexOutOfBoundsException ioe){

            System.out.println("Error, debe ser entre 0 y 4");
            nombre = nombres.get(0);
        }
                
        catch (Exception e) {
            System.out.println("Generica");
            System.out.println(e);
            nombre = nombres.get(0);
           
        } finally { //siempre se ejecuta 
            System.out.println(nombre);
            //Limpieza
            nombre = null;
        }
                            
        /*System.out.println(nombres.get(seleccion)); 
              exeption in thread */
        System.out.println("Continua el programa...");
       
        
        Aritmetica  cal  = new Aritmetica(2, 0);
        System.out.println(cal.getA() + "+" + cal.getB() + "=" +cal.sumar());
        
        try {
            System.out.println(cal.getA() + "/" + cal.getB() + "=" +cal.dividir());
        } catch (Exception e) {
            System.out.println("Error de aritmetica");
        }
        
        System.out.println("Fin del programa");
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo circ = new Circulo(4.5f);
        
        System.out.println("El area del cuadrado es: " + cuad.calcularArea());
        System.out.println("El area del circulo es: " + circ.calcularArea());
        
        System.out.println("---------------------");
        EstudianteDeportistaArtista eda = new EstudianteDeportistaArtista();
        eda.setNombre("Diana");
        eda.setCarrera("ICO");
        eda.setDisciplinaDeportiva("Futbol");
        eda.setGeneroArtistico("Fotografia, Estapampa, Dibujo");
        //nC &edad
        eda.comer();
        eda.ensayar();
        eda.entrenar();
        System.out.println(eda);
    }
    
}