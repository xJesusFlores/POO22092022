/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.clase.libro;

import java.util.Set;

/**
 *
 * @author Flores
 */
public class TareaClaseLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro Macario = new Libro();
        Macario.setNombre_del_libro("Macario");
        Macario.setAutor("B. Traven");
        Macario.setAño(1964);
        Macario.setN_paginas(67);
        Macario.setGenero("Ficción");
        
        
        System.out.println("Nombre del libro: " + Macario.getNombre_del_libro());
        System.out.println("Autor: " + Macario.getAutor());
        System.out.println("Año de publicacion: " + Macario.getAño());
        System.out.println("Numero de paginas: " + Macario.getN_paginas());
        System.out.println("Genero: " + Macario.getGenero());
        
        System.out.println("\n");
        System.out.println("Metodos --- \n");
        
        Macario.abrir();
        Macario.cerrar();
        
        System.out.println("");
        
        
    }
    
}
