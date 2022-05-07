/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Jesus Flores
 */
//JavaBean or POJO; objetos planos.  Es diferente a los EJB Enterprise Java Beans
public class Circulo implements Figura {
    
    private float radio;

            public Circulo() {
            }

            public Circulo(float radio) {
                this.radio = radio;
            }

            public float getRadio() {
                return radio;
            }

            public void setRadio(float radio) {
                this.radio = radio;
            }

            @Override
            public String toString() {
                return "Circulo{" + "radio=" + radio + '}';
            }

    @Override
    public float calcularArea() {
        //return  3.1416f * (this.radio * this.radio);
        return  Figura.PI * (this.radio * this.radio);
        
        /*Pricipio de diseño de L. P. : 0, 1 e infinito: Solo los valores 0, 1 o infinitos son validos
        para  usarse en la codificacion de algoritmos 
        El lenguaje de programacion debe proporcionar un mecanismo para evitar usar literales numericas 
        en el programa.
        
        L.P.  = Lenguajes de programacion
        */
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
        
    }
     
}
