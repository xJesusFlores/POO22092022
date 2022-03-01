/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.clase.libro;

/**
 *
 * @author Flores
 */
public class Libro {

    private String nombre_del_libro;
    private String autor;
    private String genero;
    private int año;
    private int n_paginas;
   
            
    public Libro() {
    }

    public Libro(String nombre_del_libro, String autor, int año, int n_paginas) {
        this.nombre_del_libro = nombre_del_libro;
        this.autor = autor;
        this.año = año;
        this.n_paginas = n_paginas;
        this.genero = genero;
    }
    //GETTER AND SETTER
    
    public String getNombre_del_libro() {
        return nombre_del_libro;
    }

    public void setNombre_del_libro(String nombre_del_libro) {
        this.nombre_del_libro = nombre_del_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }

   public String getGenero (){
       return genero;
    }
   
    public void setGenero (String genero){
        this.genero = genero;
    }
    
    //Metodos adicionales
    public void abrir () {
            System.out.println("El libro " + this.nombre_del_libro + " ha sido abierto" );
            
}
    public void cerrar(){
        System.out.println("El libro " + this.nombre_del_libro + " ha sido cerrado");
    }
}
    

