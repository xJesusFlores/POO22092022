package holamundo;  //ORGANIZAR La palabra package es para organizar clases

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Flores
 */
public class Persona {  //declaracion de la clase UNICA LINEA
    private String nombre;   //declaracion de los atributos int and String  LINEA 13 Y 14
    private int edad;      //NO HAY UN ESTANDAR DE NUMERO DE ATRIBUTOS QUE DEBE DE HABER, EL TIPO Y LA CANTIDAD DEPENDE DEL TIPO DE PROBLEMA QUE ESTEMOS RESOLVIENDO
 /*  IMPORATANTE Debe tener un especificador  de acesso, un tipo de dato  y un nombre */
    //metodo contructor  --PERMITEN CREAR LOS OBJETOS, VARIABLES
    public Persona() {
    }

    //metodo constructor sobrecargado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //GETTER AND SEETER
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Metodo "comer"
    public void comer(String platillo){
        System.out.println( this.nombre + " está comiendo " + platillo );
        
    }
   
    
}
