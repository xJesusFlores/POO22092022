/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author Jesus Flores
 */
public class Persona {
    //Java Bean
    protected String nombre;
    protected int edad;

        public Persona() {
        }

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
     
    public void comer (){
        System.out.println(nombre +" esta comiendo...");
    }
    
}
